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
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"a\":1}", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{\"", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"MM", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123456789012345678901234567890", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"023456789012o456789012345678_0", "<sample:9>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5d", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a1E-5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"600", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<null>", "true", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:2>", "true", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:1>", "false", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "true", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26.464Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "false", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:1>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{">>>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:2>", "true", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:0>", "true", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:2>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:10>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.>1234567890", "<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<null>", "true", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:2>", "true", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21475883548", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 18 00:00:00 PST 7590 {getDate=18, getDay=2, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=177380438400000, getTimezoneOffset=480, getYear=5690}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<null>", "false", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "true", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147588548", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Feb 17 00:00:00 PST 4765 {getDate=17, getDay=3, getHours=0, getMinutes=0, getMonth=1, getSeconds=0, getTime=88205788800000, getTimezoneOffset=480, getYear=2865}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:3>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:2>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.001Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1909-11-11T20:16:32Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "false", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "false", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21475883248", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Sep 17 00:00:00 PDT 7590 {getDate=17, getDay=1, getHours=0, getMinutes=0, getMonth=8, getSeconds=0, getTime=177372486000000, getTimezoneOffset=420, getYear=5690}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:5>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "true", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+00:00", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:3>", "false", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("190690351-02-20T17:43:26Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "false", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "true", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:5>", "true", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1903-05-05T14:07:08.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"No teme zonesindi3ator", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "false", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:4>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"---0.0i1.12345678", "<sample:11>"}, true, 0, null, 2), new String[][]{{"before", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:4>", "false", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1902-04-04T13:06:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x12345789", "<sample:4>"}, true), new String[][]{{"after", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01(", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:61", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "true", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "false", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:11>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1909-11-11T20:16:32Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 01 00:00:00 PST 2020 {getDate=1, getDay=3, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1577865600000, getTimezoneOffset=480, getYear=120}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sun Oct 17 00:00:00 PST 1238 {getDate=17, getDay=0, getHours=0, getMinutes=0, getMonth=9, getSeconds=0, getTime=-23074041600000, getTimezoneOffset=480, getYear=-662}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0.11244467", "<sample:4>"}, true, 0, null, 1), new String[][]{{"getDate", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21475883548", "<sample:5>"}, true, 0, null, 1), new String[][]{{"getMinutes", "", "0"}, {"getMonth", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21475883548", "<sample:5>"}, true), new String[][]{{"getMinutes", "", "0"}, {"getMonth", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21475883548", "<sample:5>"}, true), new String[][]{{"getMinutes", "", "0"}, {"getMonth", "", "2"}, {"toGMTString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("18 Dec 7590 08:00:00 GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.123456789012345", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Fri Dec 15 00:00:00 PST 8902 {getDate=15, getDay=5, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=218782886400000, getTimezoneOffset=480, getYear=7002}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:10>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:11>", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1909-11-11T20:16:32Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:10>", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678901234567", "<sample:13>"}, true, 0, null, 2), new String[][]{{"setMinutes", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Nov 06 00:03:00 PST 126 {getDate=6, getDay=2, getHours=0, getMinutes=3, getMonth=10, getSeconds=0, getTime=-58164364620000, getTimezoneOffset=480, getYear=-1774}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"600002020-01-01", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"600002020-01-011L", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "false", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:1>"}, true, 0, null, 3), new String[][]{{"setTime", "long", "1"}, {"compareTo", "java.util.Date", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.>1233567890", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getMonth", "", "7"}, {"getDate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:9>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:5>"}, true, 0, null, 1), new String[][]{{"setDate", "int", "6"}, {"toLocaleString", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sep 3, 2350, 12:00:00 AM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:22>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1897-03-02T11:04:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:1>"}, true, 0, null, 3), new String[][]{{"setMinutes", "int", "7"}, {"setMinutes", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon Jan 07 21:52:00 PST 2064 {getDate=7, getDay=1, getHours=21, getMinutes=52, getMonth=0, getSeconds=0, getTime=-127270030080000, getTimezoneOffset=480, getYear=164}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:5>"}, true, 0, null, 3), new String[][]{{"before", "java.util.Date", "0"}, {"setMonth", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Mon May 27 00:00:00 PST 178954622 {getDate=27, getDay=1, getHours=0, getMinutes=0, getMonth=4, getSeconds=0, getTime=-5647440502396800000, getTimezoneOffset=480, getYear=178952722}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"60000202", "<sample:1>"}, true, 0, null, 3), new String[][]{{"toGMTString", "", "7"}, {"getDate", "", "7"}, {"getTime", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127177286400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean"}, new String[]{"<sample:11>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1909-11-11T20:16:32.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:10>", "false", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1908-10-10T19:12:00Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T254:61:61", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:11>", "false", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1909-11-11T20:16:32Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:9>", "true", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1907-09-09T08:00:00.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"31475883558", "<sample:5>"}, true, 0, null, 2), new String[][]{{"toInstant", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.time.Instant", actual.getClass().getName());
  assertEquals("7590-12-28T08:00:00Z {getEpochSecond=177381302400, getNano=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21475883548", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Tue Dec 18 00:00:00 PST 7590 {getDate=18, getDay=2, getHours=0, getMinutes=0, getMonth=11, getSeconds=0, getTime=177380438400000, getTimezoneOffset=480, getYear=5690}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"GLfT*MM1.12345678", "<sample:11>"}, true, 0, null, 2), new String[][]{{"compareTo", "java.util.Date", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"10002020-0101", "<sample:6>"}, true, 0, null, 2), new String[][]{{"after", "java.util.Date", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "format", new String[]{"java.util.Date", "boolean", "java.util.TimeZone"}, new String[]{"<sample:11>", "true", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1909-11-11T20:16:32.000Z", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123456788", "<sample:4>"}, true, 0, null, 1), new String[][]{{"getHours", "", "0"}, {"before", "java.util.Date", "2"}, {"setMinutes", "int", "4"}, {"getTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140863828020000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0123456788010", "<sample:7>"}, true, 0, null, 1), new String[][]{{"getHours", "", "0"}, {"before", "java.util.Date", "2"}, {"setMinutes", "int", "4"}, {"getTime", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("246070775220000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"600002020-01-01", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Jan 01 00:00:00 PST 2020 {getDate=1, getDay=3, getHours=0, getMinutes=0, getMonth=0, getSeconds=0, getTime=1577865600000, getTimezoneOffset=480, getYear=120}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61'61", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"11475893548+1", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"6000003010-01-01", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getYear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1870", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"*hh:lm2020-02-30T25:61:61+0000", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"*hh:lm2020-02-30T25:61961+00011.1234B67", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1293456789T123556", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147483648+00:00", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147483648+00:03", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1233456789012Z466789d01234_56789", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:--1", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1293456789T122556.sss", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1293456789T225596.s", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:+--1", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.123,93456589T225596.s0x1F/x1F--1", "<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.1293456789T225596.s1.5", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"31.123,93456589T226596.", "<sample:9>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"9.129556789T225596.8s", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61Z6", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.util.ISO8601Utils", "com.google.gson.internal.bind.util.ISO8601Utils", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"9.129556789T225596.88syyyy-MM-ddThh:mm:ss2020-01-01", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
}
