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
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}), new String[][]{{"flush", "", "4"}, {"value", "java.lang.Boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{",N"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ""}}, 2), new String[][]{{"name", "java.lang.String", "5"}, {"beginObject", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "]"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", ": "}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.12344678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}), new String[][]{{"setLenient", "boolean", "3"}, {"isHtmlSafe", "", "0"}, {"value", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}), new String[][]{{"value", "double", "7"}, {"close", "", "4"}, {"nullValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 30, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.235567890123456"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "NaN"}}, 3), new String[][]{{"get", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonObject", actual.getClass().getName());
  assertEquals("{} {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharacte...#613#-413588791", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"<null>"}, false), new String[][]{{"getSerializeNulls", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1.24:"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}), new String[][]{{"setHtmlSafe", "boolean", "5"}, {"nullValue", "", "7"}, {"setSerializeNulls", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "long", "-9223372036854644736"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:1048577>"}}, 3), new String[][]{{"flush", "", "0"}, {"close", "", "6"}, {"setSerializeNulls", "boolean", "0"}, {"flush", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1\r54d"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "I"}, {"com.google.gson.stream.JsonWriter", "value", "double", "-1.0"}}, 3), new String[][]{{"value", "long", "4"}, {"get", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1P43832,\r91Dangli7ng!a8e; a I1.255.\tJsonWriter nis!closed."}, false, 13, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:1048628>"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "}"}}, 1), new String[][]{{"endObject", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"<na</a>mull1"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:2097235>"}}, 2), new String[][]{{"setHtmlSafe", "boolean", "1"}, {"setLenient", "boolean", "5"}, {"setIndent", "java.lang.String", "3"}, {"nullValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}), new String[][]{{"value", "double", "2"}, {"value", "java.lang.Number", "4"}, {"isHtmlSafe", "", "5"}, {"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", ";\t"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 2), new String[][]{{"isLenient", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"1.12444678|Infinity"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}, 2), new String[][]{{"value", "double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "1"}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "1"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "0x1F"}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "0x1F"}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "1.9000000000000004"}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"jsonValue", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"10"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1), new String[][]{{"flush", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1), new String[][]{{"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("1.7976931348623157E308 {getAsBigDecimal=1.7976931348623157E+308, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=-1, getAsCharacter=1, getAsDouble=1.7976931348623157E308, getAsFl...#426#-497431020", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.0"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1), new String[][]{{"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("1.0 {getAsBigDecimal=1.0, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=1, getAsCharacter=1, getAsDouble=1.0, getAsFloat=1.0, getAsInt=1, getAsLong=1, getAsNumber=1.0, getAsSho...#296#1698196713", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1), new String[][]{{"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("1.0000000000000002 {getAsBigDecimal=1.0000000000000002, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=1, getAsCharacter=1, getAsDouble=1.0000000000000002, getAsFloat=1.0, getAs...#371#-1015347347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 2), new String[][]{{"isHtmlSafe", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"I"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"I"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 2), new String[][]{{"endArray", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-0.05600000000000001"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "TITLE"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 2), new String[][]{{"jsonValue", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 2), new String[][]{{"value", "java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 2), new String[][]{{"value", "java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "-1.0"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "-58.882"}, {"com.google.gson.stream.JsonWriter", "flush", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"80xFFFFFFPF"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", ""}}, 2), new String[][]{{"name", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"202/-01-01"}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", ""}}, 2), new String[][]{{"isHtmlSafe", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"202/-01-01"}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", ""}}, 2), new String[][]{{"isHtmlSafe", "", "5"}, {"isLenient", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{",N"}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "Ea"}}, 2), new String[][]{{"isHtmlSafe", "", "5"}, {"beginArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"E \\itld"}, false, 1, new String[][]{}, 2), new String[][]{{"name", "java.lang.String", "5"}, {"endObject", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"-Infimity"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.12345678901234567"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"beginArray", "", "0"}, {"setLenient", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 2), new String[][]{{"value", "long", "0"}, {"setIndent", "java.lang.String", "1"}, {"beginObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3), new String[][]{{"setSerializeNulls", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "out == null"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "true"}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"2021-/1-01PT1Ha4,b,c"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"2021-/1-01PT1Ha4,b,c"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1), new String[][]{{"getSerializeNulls", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "9223372036854775807"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"2/12345679012355670x123456789000"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}}, 2), new String[][]{{"value", "java.lang.Boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:1.5>"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"isLenient", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "\""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "\""}}), new String[][]{{"setLenient", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"value", "long", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "0x1F"}, {"com.google.gson.stream.JsonWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "0x1F"}, {"com.google.gson.stream.JsonWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "a b"}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "2.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "2.0"}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}), new String[][]{{"value", "double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}), new String[][]{{"value", "double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"abc"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"abc"}, false), new String[][]{{"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "-1.0"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}}), new String[][]{{"get", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false), new String[][]{{"jsonValue", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}), new String[][]{{"flush", "", "4"}, {"value", "java.lang.Boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"\\u2028"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}), new String[][]{{"flush", "", "4"}, {"value", "java.lang.Boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}), new String[][]{{"isHtmlSafe", "", "4"}, {"setLenient", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}), new String[][]{{"isLenient", "", "4"}, {"getSerializeNulls", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"Dangling name: NaN"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-3.5>"}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}), new String[][]{{"isLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<null>"}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"z{4"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:0.75>"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}), new String[][]{{"isHtmlSafe", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"o"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}), new String[][]{{"endArray", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"e12345567"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "0xFFFFFFFF"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false), new String[][]{{"isHtmlSafe", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "\\u2028"}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "Incomplete document"}}), new String[][]{{"flush", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"setLenient", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"-11.1234567"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "-0.0"}}), new String[][]{{"name", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"-11.123456P"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", ""}}), new String[][]{{"name", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"-11.123456P"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}), new String[][]{{"name", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false), new String[][]{{"name", "java.lang.String", "1"}, {"isLenient", "", "1"}, {"isHtmlSafe", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false, 8, new String[][]{}), new String[][]{{"isHtmlSafe", "", "1"}, {"isHtmlSafe", "", "1"}, {"getSerializeNulls", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}), new String[][]{{"value", "long", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1T1024W778Nes-0.0a mb"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "flush", ""}}), new String[][]{{"isLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "Title"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}), new String[][]{{"value", "long", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"beginArray", "", "0"}, {"setLenient", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"JsonWriter is closed."}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"0.2"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "flush", ""}}), new String[][]{{"value", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"value", "java.lang.Number", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"setHtmlSafe", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getSerializeNulls", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"setSerializeNulls", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "-1.7976931348623157E308"}}), new String[][]{{"get", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "endObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"{\""}, false, 16, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}}), new String[][]{{"beginArray", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"get", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonObject", actual.getClass().getName());
  assertEquals("{} {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharacte...#613#-413588791", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"0.0"}, false), new String[][]{{"flush", "", "5"}, {"isLenient", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"close", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}), new String[][]{{"isLenient", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"getSerializeNulls", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"getSerializeNulls", "", "5"}, {"isLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "-11.1234567"}}, 3), new String[][]{{"getSerializeNulls", "", "5"}, {"isLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{":"}, false), new String[][]{{"setHtmlSafe", "boolean", "2"}, {"getSerializeNulls", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"jsonValue", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"jsonValue", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}}, 3), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"a.c1.1234567890123456"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 12, new String[][]{}), new String[][]{{"value", "long", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "1.12344678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-4611685949707911180"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "E \\i1ld["}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"0"}, false, 14, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "E \\1ld["}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}, 1), new String[][]{{"value", "java.lang.Number", "3"}, {"beginArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"9223372036854775783"}, false, 16, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "E \\1ld["}, {"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "long", "1"}}), new String[][]{{"value", "java.lang.Number", "3"}, {"beginArray", "", "4"}, {"setLenient", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"88"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"value", "java.lang.Boolean", "5"}, {"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}, 3), new String[][]{{"isHtmlSafe", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}), new String[][]{{"setIndent", "java.lang.String", "6"}, {"setLenient", "boolean", "2"}, {"setSerializeNulls", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"close", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{",/+1s"}, false, 0, null, 1), new String[][]{{"close", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, null, 1), new String[][]{{"close", "", "1"}, {"isHtmlSafe", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"isHtmlSafe", "", "6"}, {"isHtmlSafe", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1), new String[][]{{"isHtmlSafe", "", "6"}, {"isHtmlSafe", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1), new String[][]{{"getSerializeNulls", "", "6"}, {"flush", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1L0x1F"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 1), new String[][]{{"beginObject", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"value", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}}, 2), new String[][]{{"value", "long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 1), new String[][]{{"setLenient", "boolean", "3"}, {"isHtmlSafe", "", "0"}, {"value", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.12.345678"}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.12.345678"}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:1.5>"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 3), new String[][]{{"beginObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 3), new String[][]{{"close", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:0.75>"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 3), new String[][]{{"beginObject", "", "4"}, {"value", "double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "double", "1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}}), new String[][]{{"isLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-7.2>"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 2), new String[][]{{"setIndent", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:0.1794>"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}), new String[][]{{"setIndent", "java.lang.String", "3"}, {"value", "double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"get", "", "3"}, {"addProperty", "java.lang.String,java.lang.Character", "2"}, {"isJsonObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"get", "", "3"}, {"addProperty", "java.lang.String,java.lang.Character", "2"}, {"isJsonObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"setIndent", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 3), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.5d"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.5d"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"1.5e301"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "endObject", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "-1"}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}), new String[][]{{"value", "java.lang.String", "7"}, {"close", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "o"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"jta;e"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"{\"b\":1}"}, false, 0, null, 1), new String[][]{{"nullValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"{\"a\"11}"}, false, 14, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 1), new String[][]{{"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"T"}, false, 14, new String[][]{}), new String[][]{{"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}, 2), new String[][]{{"value", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 3), new String[][]{{"beginArray", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"isLenient", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\ng"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 2), new String[][]{{"isHtmlSafe", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"isLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"isLenient", "", "2"}, {"getSerializeNulls", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3), new String[][]{{"isLenient", "", "2"}, {"getSerializeNulls", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"1.5-e300"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"1.5-e300"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-1.5>"}}, 3), new String[][]{{"isHtmlSafe", "", "3"}, {"isLenient", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"0x12345578::"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-1.452>"}}, 3), new String[][]{{"value", "java.lang.Number", "3"}, {"isLenient", "", "7"}, {"value", "boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "1"}}), new String[][]{{"isHtmlSafe", "", "0"}, {"setHtmlSafe", "boolean", "2"}, {"value", "double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"9223369837831520255"}, false, 0, null, 3), new String[][]{{"value", "java.lang.Number", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 1), new String[][]{{"value", "double", "2"}, {"setIndent", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-31"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 3), new String[][]{{"close", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"1"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 3), new String[][]{{"getSerializeNulls", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"+"}, false, 14, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"{--1"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:-1>"}}, 1), new String[][]{{"setLenient", "boolean", "2"}, {"isHtmlSafe", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}), new String[][]{{"setLenient", "boolean", "2"}, {"isHtmlSafe", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"out ==2null"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}), new String[][]{{"setLenient", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"value", "java.lang.Number", "0"}, {"value", "double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-1.0"}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}}), new String[][]{{"get", "", "0"}, {"getAsNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, null, 3), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
}
