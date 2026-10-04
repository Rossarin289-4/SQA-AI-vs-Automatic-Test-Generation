package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}, {"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"11"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"setIndent", "java.lang.String", "5"}, {"beginArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"J''"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}), new String[][]{{"beginArray", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"value", "java.lang.Number", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "110"}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "<null>"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}), new String[][]{{"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.12345678901234567"}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:0>"}}), new String[][]{{"name", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "nextLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 2 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "doPeek", ""}, {"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 8 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "nextInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "peek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"a= aUn"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}), new String[][]{{"value", "java.lang.Number", "2"}, {"value", "java.lang.String", "5"}, {"getSerializeNulls", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false), new String[][]{{"close", "", "5"}, {"flush", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "skipValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 7 {getPath=$.null, hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-1>"}, false, 0, null, 1), new String[][]{{"close", "", "2"}, {"close", "", "5"}, {"value", "boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "nextLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "nextString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t<", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 9 {getPath=$, hasNext=!MalformedJsonException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "JsonReaer is closed"}}), new String[][]{{"get", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:1>"}, {"com.google.gson.stream.JsonWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"JsonReaer is closed"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"endArray", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$., hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}, {"com.google.gson.stream.JsonReader", "nextString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-2147483648>"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "http://example.com/a?b=c"}, {"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 3), new String[][]{{"value", "boolean", "6"}, {"value", "long", "7"}, {"value", "double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"0D'a-63Ep9cted v.letrue"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 2), new String[][]{{"setSerializeNulls", "boolean", "6"}, {"value", "java.lang.Number", "5"}, {"close", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.1234567890123456"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.1234567890123456"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-0.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2), new String[][]{{"value", "boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 2), new String[][]{{"value", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 2), new String[][]{{"value", "boolean", "7"}, {"value", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}, {"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "12:30:45"}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "6"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-2.0"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 2), new String[][]{{"endObject", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "peek", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "getPath", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "skipValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "w1a"}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "toString", ""}, {"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "13"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.1234567890123456"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.1234567890123456"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}, {"com.google.gson.stream.JsonReader", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "doPeek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "doPeek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "doPeek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"value", "boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"value", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}), new String[][]{{"value", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"'"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "5.999999999999999"}, {"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 7 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 8 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 8 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "abc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "abc"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "12:30:45"}, {"com.google.gson.stream.JsonWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "getPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "getPath", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"-1h"}, false, 14, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "10"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}), new String[][]{{"setSerializeNulls", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-26"}, false), new String[][]{{"value", "boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 2 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-15.8925"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "flush", ""}}), new String[][]{{"endObject", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-1.0"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "[1,2]"}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "getLineNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "Expected value"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}, {"com.google.gson.stream.JsonReader", "getColumnNumber", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"'"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"'"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}), new String[][]{{"beginArray", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"J''Expected null but was "}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "i"}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}), new String[][]{{"beginArray", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaacaaaaaaaaa"}, false), new String[][]{{"getSerializeNulls", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "1.12345678901234567"}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 4 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"Expected a namE bu"}, false, 0, null, 1), new String[][]{{"value", "java.lang.Number", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"66179+1"}, false), new String[][]{{"value", "double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "peek", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 2 column 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "peek", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 4 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "peek", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"2L"}, false), new String[][]{{"getSerializeNulls", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t<", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 9 {getPath=$, hasNext=!MalformedJsonException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 21, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"Expected a name but was "}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false), new String[][]{{"value", "double", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "peek", ""}, {"com.google.gson.stream.JsonReader", "peek", ""}, {"com.google.gson.stream.JsonReader", "getColumnNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "long", "39"}}), new String[][]{{"value", "java.lang.Number", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "beginArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextInt", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"Unexpected value"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "false"}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"_nexpectedd valud"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "13"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"_o"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "getPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 2 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}, {"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
}
