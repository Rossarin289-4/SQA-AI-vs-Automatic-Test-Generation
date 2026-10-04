package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"//", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:2>", "false", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Z", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<null>", "true", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-1.5", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"McM0", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 17 00:00:00 PST 1238 {getDate=17, getDay=0, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=-23074041600000, getTimezoneOffset=480, getYear=-662}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "false", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a ", "<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<null>", "false", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:1>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:2>", "false", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:2>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "false", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "true", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "true", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"ddd", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1234567890123456", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"(", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:1>", "false", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:2>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:0>", "true", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "false", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:1>", "false", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITME", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "true", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "true", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<null>", "true", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:5>"}, true), new String[][]{{"setDate", "int", "1"}, {"getSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+00:005.", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "true", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:5>"}, true), new String[][]{{"toInstant", "", "2"}, {"with", "java.time.temporal.TemporalField,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x12345689", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Oct 28 00:00:00 PST 1238 {getDate=28, getDay=4, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=-23073091200000, getTimezoneOffset=480, getYear=-662}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "true", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "true", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "true", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i2020-02-30T25:61:61", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getMonth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147482648", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Mar 20 00:00:00 PDT 4750 {getDate=20, getDay=1, getHours=0, getMinutes=0, getMonth=2, getSeconds=0, getTime=87735078000000, getTimezoneOffset=420, getYear=2850}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-02", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Jan 02 00:00:00 PST 2020 {getDate=2, getDay=4, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1577952000000, getTimezoneOffset=480, getYear=120}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21474836648", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jul 18 00:00:00 PDT 7488 {getDate=18, getDay=3, getHours=0, getMinutes=0, getMonth=6, getSeconds=0, getTime=174148470000000, getTimezoneOffset=420, getYear=5588}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "false", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"00x123456789", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 27 00:00:00 PDT 2350 {getDate=27, getDay=3, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=12014895600000, getTimezoneOffset=420, getYear=450}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:1>"}, true), new String[][]{{"getDay", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"[1,2^2020-01-01", "<sample:7>"}, true), new String[][]{{"getDay", "", "5"}, {"compareTo", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12346678", "<sample:4>"}, true), new String[][]{{"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-23047776000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:61+1mm", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "true", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 01 00:00:00 PST 2020 {getDate=1, getDay=3, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1577865600000, getTimezoneOffset=480, getYear=120}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1020-01-01", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Jan 01 00:00:00 PST 1020 {getDate=1, getDay=5, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=-29978611200000, getTimezoneOffset=480, getYear=-880}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"01060000", "<sample:1>"}, true, 0, null, 3), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Nov 30 00:00:00 PST 105 {getDate=30, getDay=0, getHours=0, getMinutes=0, getMonth=10, getSeconds=0, getTime=-58824979200000, getTimezoneOffset=480, getYear=-1795}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345672020-01-011", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12045678Z", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:71", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+12020-01-01", "<sample:4>"}, true, 0, null, 3), new String[][]{{"compareTo", "java.util.Date", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:71.5", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2021-02-30T25:61:71.52020-02-30T25:61:61", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 17 00:00:00 PST 1238 {getDate=17, getDay=0, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=-23074041600000, getTimezoneOffset=480, getYear=-662}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "true", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"214748348", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getMonth", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:71.51e10hh", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:611:71", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i2020-02-40T255:61:61", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147483648", "<sample:4>"}, true, 0, null, 1), new String[][]{{"after", "java.util.Date", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a.12345678", "<sample:4>"}, true, 0, null, 1), new String[][]{{"getTime", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-23074041600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:612020-01-01", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 17 00:00:00 PST 1238 {getDate=17, getDay=0, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=-23074041600000, getTimezoneOffset=480, getYear=-662}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 01 00:00:00 PST 2020 {getDate=1, getDay=3, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1577865600000, getTimezoneOffset=480, getYear=120}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678+0000", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123466789", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Thu Sep 27 00:00:00 PDT 2351 {getDate=27, getDay=4, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=12046431600000, getTimezoneOffset=420, getYear=451}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"214758364800", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Nov 30 00:00:00 PST 5839 {getDate=30, getDay=6, getHours=0, getMinutes=0, getMonth=10, getSeconds=0, getTime=122122627200000, getTimezoneOffset=480, getYear=3939}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x23456789", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Sep 27 00:00:00 PDT 2350 {getDate=27, getDay=3, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=12014895600000, getTimezoneOffset=420, getYear=450}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.22345678", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getSeconds", "", "4"}, {"getMinutes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "true", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x23456789", "<sample:4>"}, true, 0, null, 3), new String[][]{{"after", "java.util.Date", "2"}, {"setTime", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=4, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147483648", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 17 00:00:00 PST 4751 {getDate=17, getDay=3, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=87761260800000, getTimezoneOffset=480, getYear=2851}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345672020-01", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:71.", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x13456789+00:00", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61--1", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61+1", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61Z61+1mm1.5", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1..12345671020-01", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Oct 19 18:00:00 PDT 4567 {getDate=19, getDay=1, getHours=18, getMinutes=0, getMonth=9, getSeconds=0, getTime=81978656400000, getTimezoneOffset=420, getYear=2667}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1-12345672020-01:", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
}
