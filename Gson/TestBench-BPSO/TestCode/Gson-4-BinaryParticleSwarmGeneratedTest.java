package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "peek", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"setHtmlSafe", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-65279"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}, {"com.google.gson.stream.JsonReader", "nextString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "peek", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}}), new String[][]{{"setSerializeNulls", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "endArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"-1true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 3), new String[][]{{"jsonValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "nextInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"Expected null but\037was "}, false), new String[][]{{"name", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 2), new String[][]{{"flush", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"0x023456789"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}), new String[][]{{"value", "java.lang.Number", "7"}, {"endObject", "", "5"}, {"value", "double", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "2.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "skipValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "doPeek", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "12:30:51L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"close", "", "1"}, {"nullValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:55.53>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 2), new String[][]{{"value", "double", "2"}, {"beginArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"Expected null\037but\037was PT1H"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 9 {getPath=$, hasNext=!MalformedJsonException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t<", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 9 {getPath=$, hasNext=!MalformedJsonException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "<null>"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}), new String[][]{{"get", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}), new String[][]{{"value", "double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "\013"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"PTe1uH"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}), new String[][]{{"endObject", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "92"}, {"com.google.gson.stream.JsonWriter", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "{\"b\":1}"}}), new String[][]{{"setHtmlSafe", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 4 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"-"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:0.75>"}}), new String[][]{{"setSerializeNulls", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-14.0"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}}), new String[][]{{"close", "", "5"}, {"name", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "skipValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 7 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"1-5f"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "e1.12345678901234567"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1), new String[][]{{"close", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaa`aaaaaaa"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "1.123456781e10"}}, 3), new String[][]{{"name", "java.lang.String", "6"}, {"value", "java.lang.Number", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "isLenient", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"5.Unterminated object"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}, {"com.google.gson.stream.JsonReader", "getPath", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:55.5>"}, false, 1, new String[][]{}, 2), new String[][]{{"setSerializeNulls", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "getPath", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "PT1HTRU"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-5.5>"}, false, 0, null, 2), new String[][]{{"setIndent", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "isLenient", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "getColumnNumber", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "0.0"}, {"com.google.gson.stream.JsonWriter", "value", "long", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "isLenient", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-0.024"}, false, 4, new String[][]{}, 1), new String[][]{{"endObject", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "isLenient", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}, {"com.google.gson.stream.JsonReader", "peek", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"   path "}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 2), new String[][]{{"endArray", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("STRING", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "peek", ""}, {"com.google.gson.stream.JsonReader", "skipValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "-922337203685477581"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}, {"com.google.gson.stream.JsonReader", "hasNext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}, {"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-9.223372036854776E18"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"9.2233720368547763E17"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}}), new String[][]{{"name", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"I"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-9.223372036854776E18"}, false, 4, new String[][]{}), new String[][]{{"close", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "-922337203685476555"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextBoolean", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"38"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-922337203417042123"}, false), new String[][]{{"beginArray", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "1k"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "PT1HTRUE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "u"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<null>"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "1.55dd"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "getLineNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"2.999999999999999"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.12345677890123456"}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "toString", ""}, {"com.google.gson.stream.JsonReader", "endArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\t"}, false), new String[][]{{"setLenient", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}), new String[][]{{"value", "boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextInt", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:55.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "falls"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "getPath", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"value", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"Expectd valu3e"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "getLineNumber", ""}, {"com.google.gson.stream.JsonReader", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonReader", "getPath", ""}, {"com.google.gson.stream.JsonReader", "setLenient", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endArray", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"PTe1vH"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1;a"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Expected null\037but was "}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "nextLong", ""}, {"com.google.gson.stream.JsonReader", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:1>"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "beginArray", ""}, {"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "value", "long", "-56"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"Expecsed name10"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "//a/b"}}), new String[][]{{"beginObject", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "hasNext", ""}, {"com.google.gson.stream.JsonReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}, {"com.google.gson.stream.JsonReader", "skipValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 3 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "1.7976931348623155E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"l1.5f"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}, 1), new String[][]{{"endObject", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-127>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "endArray", ""}}), new String[][]{{"getSerializeNulls", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "nextInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "getColumnNumber", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "doPeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}, {"com.google.gson.stream.JsonReader", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextName", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "-37"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"!"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 1), new String[][]{{"value", "java.lang.Number", "6"}, {"name", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"\t\t"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}}), new String[][]{{"isHtmlSafe", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"274877906944"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextNull", ""}, {"com.google.gson.stream.JsonReader", "beginObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"Sxpected ntll but was "}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonReader", "getLineNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"ab"}, false), new String[][]{{"setSerializeNulls", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}), new String[][]{{"setHtmlSafe", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextDouble", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonReader", "doPeek", ""}, {"com.google.gson.stream.JsonReader", "nextName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "srue"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 1), new String[][]{{"value", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 3), new String[][]{{"isLenient", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}, {"com.google.gson.stream.JsonReader", "nextBoolean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"Ex6ected '1:'"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"X65279"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"Expe-ed name"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "endObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"NLL"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "47"}}), new String[][]{{"jsonValue", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"202-01-01"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 1), new String[][]{{"beginArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!EOFException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"Unexpected valueUnterminated array"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonReader", "endObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonReader", "beginObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "skipValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"7"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", ".5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "getPath", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 1 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "setLenient", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "TRUE"}}, 2), new String[][]{{"setHtmlSafe", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"Expected a ame but was "}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "77"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"close", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "TUE"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "nextNull", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "getColumnNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonReader", "nextString", ""}, {"com.google.gson.stream.JsonReader", "nextString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=!MalformedJsonException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextBoolean", ""}, {"com.google.gson.stream.JsonReader", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonReader at line 1 column 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonReader at line 1 column 2 {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonReader", "com.google.gson.stream.JsonReader", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonReader", "nextInt", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
}
