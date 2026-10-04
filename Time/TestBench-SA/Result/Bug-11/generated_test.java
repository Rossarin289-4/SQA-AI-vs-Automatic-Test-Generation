package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LenientChronology", actual.getClass().getName());
  assertEquals("LenientChronology[ISOChronology[UTC]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getStartOfYear", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", actual.getClass().getName());
  assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"1L", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<null>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"-"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getStartOfYear", new String[]{}, new String[]{}, true), new String[][]{{"addCutover", "org.joda.time.tz.DateTimeZoneBuilder,int", "5"}, {"addCutover", "org.joda.time.tz.DateTimeZoneBuilder,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", actual.getClass().getName());
  assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"-"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:1>", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:2>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"only", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("75600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "verbose", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"max", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-75600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"1", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"s"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<null>", "<sample:1>"}, false, 6, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:7>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:8>"}}), new String[][]{{"subMap", "java.lang.Object,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 1, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:1>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:7>"}}, 2), new String[][]{{"keySet", "", "5"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"maximum", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"min", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"Z"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"minimum", "13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{">="}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"6"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:3>", "<null>"}, false, 14, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 15, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:8>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<sample:6>"}, false, 15, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}}, 3), new String[][]{{"lastKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:2>", "<sample:6>"}, false, 14, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:1>"}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}, {"firstEntry", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.AbstractMap$SimpleImmutableEntry", actual.getClass().getName());
  assertEquals("key=0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:1>"}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}, {"firstEntry", "", "5"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:1>", "<sample:3>"}, false, 4, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<empty>"}, false, 5, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:10>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}, {"headMap", "java.lang.Object", "5"}, {"higherEntry", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"I", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 15, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:1>", "<null>"}}, 2), new String[][]{{"firstEntry", "", "3"}, {"headMap", "java.lang.Object,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$AscendingSubMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 15, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:8>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:1>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:0>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:8>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"only", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"only0x123456789", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"mX*"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"[1,2]1.5u"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45045000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"12:O0:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{","}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"aaaaaa`abaaaaaaaaEba<aaaaaaaaaab", "1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LenientChronology", actual.getClass().getName());
  assertEquals("LenientChronology[ISOChronology[UTC]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"only", "1073742335"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073742335", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"5", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"010", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getStartOfYear", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", actual.getClass().getName());
  assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"SaveMillis: "}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<empty>"}, false, 6, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<empty>", "<null>"}}, 2), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<empty>"}, false, 8, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<empty>", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:2>"}}, 1), new String[][]{{"firstKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<null>", "<null>"}, false, 3, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:2>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:4>", "<null>"}}, 1), new String[][]{{"ceilingKey", "java.lang.Object", "6"}, {"ceilingEntry", "java.lang.Object", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<null>", "<null>"}, false, 3, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:2>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:4>", "<null>"}}, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getStartOfYear", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", actual.getClass().getName());
  assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<sample:9>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "verbose", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<null>"}, false, 0, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:3>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"keySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LenientChronology", actual.getClass().getName());
  assertEquals("LenientChronology[ISOChronology[UTC]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 1, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"\uffff"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<null>"}, false, 0, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"-verboe"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-verboe", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"-verb=e"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-verb=e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"MS"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"MSTITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MSTITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("w", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<empty>"}, false, 1, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:1>", "<sample:3>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:4>"}}, 3), new String[][]{{"descendingKeySet", "", "0"}, {"tailSet", "java.lang.Object,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"TITLY0.e", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"SaveMillis: "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SaveMillis: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"aweM"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aweM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"0x1F", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"1,-m420020.01-t01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1,-m420020.01-t01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<empty>", "<empty>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<null>", "<sample:3>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"PT2Habb"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"null"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:1>", "<null>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<null>"}, false, 13, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<null>"}, false, 13, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 13, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:2>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 7, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:2>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:3>"}}), new String[][]{{"keySet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"weekyear", "", "0"}, {"getMinimumValue", "org.joda.time.ReadablePartial,int[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-292275054", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 15, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:8>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"1.5f", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:1>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:4>", "<empty>"}, false), new String[][]{{"firstEntry", "", "3"}, {"headMap", "java.lang.Object,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$AscendingSubMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<null>", "<empty>"}, false, 0, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<null>", "<sample:5>"}}), new String[][]{{"containsKey", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<null>", "<sample:5>"}}), new String[][]{{"floorEntry", "java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"1L", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", new String[]{"java.io.BufferedReader"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"halfdays", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[halfdays] {getName=halfdays, getUnitMillis=43200000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"\tRules not found: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tRules not found: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"\tRukes not found: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tRukes not found: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"\tRukes not rfound: "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tRukes not rfound: ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"\tRukes not rfo"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tRukes not rfo", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"24:00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("24:00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"-2147483648", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"-1", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"minuteOfHour", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfHour] {getMaximumValue=59, getMinimumValue=0, getName=minuteOfHour, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<sample:9>"}, false, 7, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<empty>", "<sample:3>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<empty>", "<null>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:2>"}}), new String[][]{{"firstKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:3>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 1, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:2>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:3>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:0>", "<sample:1>"}}), new String[][]{{"pollLastEntry", "", "6"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<null>", "<empty>"}, false, 6, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:3>"}}), new String[][]{{"values", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getStartOfYear", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"addCutover", "org.joda.time.tz.DateTimeZoneBuilder,int", "5"}, {"addCutover", "org.joda.time.tz.DateTimeZoneBuilder,int", "6"}, {"addCutover", "org.joda.time.tz.DateTimeZoneBuilder,int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", actual.getClass().getName());
  assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("75600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"24:00"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"<="}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"<"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{";"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<null>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"millisOfDay", "", "7"}, {"getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "1"}, {"getLeapDurationField", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43200000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"1123457"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("39600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"a b"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"yearOfCentury", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getMaximumValue=99, getMinimumValue=0, getName=yearOfCentury, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LenientChronology", actual.getClass().getName());
  assertEquals("LenientChronology[ISOChronology[UTC]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"only", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "verbose", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"clockhourOfDay", "", "5"}, {"getLeapDurationField", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"bjs"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bjs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"bs"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"bs1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bs1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"bs1.12345677901234556%-veraoseonly="}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bs1.12345677901234556%-veraoseonly=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"bs1.12345670901234656%-weraoreonly="}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bs1.12345670901234656%-weraoreonly=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"+1", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"max", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 9, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<empty>", "<sample:2>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:0>", "<sample:1>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:8>"}}, 3), new String[][]{{"higherEntry", "java.lang.Object", "5"}, {"higherKey", "java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 12, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<empty>", "<sample:1>"}, false, 12, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:3>"}, {"org.joda.time.tz.ZoneInfoCompiler", "compile", "java.io.File,java.io.File[]", "<sample:2>", "<sample:0>"}}, 3), new String[][]{{"containsKey", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "compile", new String[]{"java.io.File", "java.io.File[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:0>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:3>"}, {"org.joda.time.tz.ZoneInfoCompiler", "parseDataFile", "java.io.BufferedReader", "<sample:8>"}}, 3), new String[][]{{"comparator", "", "5"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"dayOfMonth", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"millisOfDay", "", "0"}, {"getAsText", "int,java.util.Locale", "3"}, {"set", "long,java.lang.String,java.util.Locale", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true), new String[][]{{"validate", "org.joda.time.ReadablePartial,int[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "verbose", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"only"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("only", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"-2147483648", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "2147483646"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"7", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"24:00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "writeZoneInfoMap", new String[]{"java.io.DataOutputStream", "java.util.Map"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"-1", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"clockhourOfDay", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfDay] {getMaximumValue=24, getMinimumValue=1, getName=clockhourOfDay, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "test", new String[]{"java.lang.String", "org.joda.time.DateTimeZone"}, new String[]{"src", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"Z"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"2147483647", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"214783647", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("214783647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"-1.5i"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"112345678", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("112345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"a,3,c0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,3,c0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"Z"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"s"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseOptional", new String[]{"java.lang.String"}, new String[]{"5.u"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"0.x300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"-5?"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-18000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"9", "-2147483593"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"9", "-2147483602"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"8", "-2147483602"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"010", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"2020-01-A01-?1E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"get", "org.joda.time.ReadablePeriod,long,long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"get", "org.joda.time.ReadablePeriod,long,long", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"2147483648-src"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("75600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"-1", "13"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"secondOfDay", "", "2"}, {"addWrapField", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"s"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"110", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"year", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[year] {getMaximumValue=292278993, getMinimumValue=-292275054, getName=year, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"S"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseZoneChar", new String[]{"char"}, new String[]{"z"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"days", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("75600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"days", "", "6"}, {"getValue", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"12:30:5123456788012345678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45051000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"secondOfMinute", "", "1"}, {"getAsText", "long,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"4-w1erboHe"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"get", "org.joda.time.ReadablePeriod,long", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"-1M-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"yearOfCentury", "", "0"}, {"getDifference", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseTime", new String[]{"java.lang.String"}, new String[]{"3147383r48"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"minimum", "-2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"max", "2147483633"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"add", "org.joda.time.ReadablePeriod,long,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3888000004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"010", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"00", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"yearOfCentury", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getMaximumValue=99, getMinimumValue=0, getName=yearOfCentury, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"months", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2629746000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"-2147483648", "-2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"only", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"5", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseYear", new String[]{"java.lang.String", "int"}, new String[]{"6", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"days", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"add", "org.joda.time.ReadablePeriod,long,int", "0"}, {"dayOfYear", "", "4"}, {"add", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("345600003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"8"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"centuryOfEra", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.LenientDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922789, getMinimumValue=0, getName=centuryOfEra, isLenient=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"hours", "", "2"}, {"isPrecise", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"weeks", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseDayOfWeek", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "getLenientISOChronology", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.tz.ZoneInfoCompiler", "org.joda.time.tz.ZoneInfoCompiler", "parseMonth", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
