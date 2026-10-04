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
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Expecting number, got: "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Expecting number, got: "}}, 3), new String[][]{{"flush", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:0>"}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<sample:4>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:-31>"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "long", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "-1"}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 2), new String[][]{{"get", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"isLenient", "", "4"}, {"setHtmlSafe", "boolean", "3"}, {"value", "boolean", "5"}, {"value", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"Siglxe"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"name", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"setHtmlSafe", "boolean", "2"}, {"value", "java.lang.String", "6"}, {"beginObject", "", "3"}, {"isHtmlSafe", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-2147483648>"}, false, 10, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}), new String[][]{{"value", "boolean", "3"}, {"endObject", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<sample:6>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "5"}, {"fromJson", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Expected a "}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:3>", "<sample:5>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<empty>", "<empty>", "<sample:1>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}, {"toJsonTree", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "-1.0"}, {"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Boolean", "<null>"}}, 3), new String[][]{{"close", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "0"}, {"com.google.gson.stream.JsonWriter", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"0.5"}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "m3inute"}, {"com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", ""}}, 3), new String[][]{{"value", "java.lang.Number", "5"}, {"endObject", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 42, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1.12334567"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "true1.12345678901234667"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "--1"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "8Couldn'tg writtte "}}, 1), new String[][]{{"endArray", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1), new String[][]{{"value", "java.lang.Number", "3"}, {"close", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{".1.b"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1), new String[][]{{"value", "java.lang.Number", "3"}, {"close", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "minute"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "http:./examp8e.Icom/a?b=c"}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<d:-1.5>"}}, 2), new String[][]{{"get", "", "2"}, {"addProperty", "java.lang.String,java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonObject", actual.getClass().getName());
  assertEquals("{\"http:./examp8e.Icom/a?b=c\":-1.5,\"sample\":\"\\u0000\"} {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAs...#663#2072587423", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"close", "", "3"}, {"name", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<empty>", "<sample:7>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "5"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}, {"read", "com.google.gson.stream.JsonReader", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 2), new String[][]{{"value", "boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1-"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "1"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "2"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}), new String[][]{{"isLenient", "", "7"}, {"close", "", "4"}, {"setSerializeNulls", "boolean", "0"}, {"close", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-1073807268>"}, false, 15, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "Execte::d a +1"}}, 3), new String[][]{{"value", "java.lang.String", "2"}, {"value", "boolean", "7"}, {"setHtmlSafe", "boolean", "1"}, {"name", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "name", new String[]{"java.lang.String"}, new String[]{"--123456789012345678901334567890"}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "1ee1\r1.12345678901234567"}}, 1), new String[][]{{"endArray", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", "1.12345678901234567"}}, 2), new String[][]{{"setSerializeNulls", "boolean", "2"}, {"setIndent", "java.lang.String", "4"}, {"isHtmlSafe", "", "2"}, {"close", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<sample:4>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "5"}, {"fromJsonTree", "com.google.gson.JsonElement", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}, 3), new String[][]{{"close", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}}, 3), new String[][]{{"flush", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Expecting number, got: "}}, 3), new String[][]{{"flush", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Factory[type="}}, 3), new String[][]{{"flush", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"value", "double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"value", "double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"value", "double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"value", "double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endArray", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "1.1234567890123456"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "1.1234567890123456"}, {"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", "\n"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 2), new String[][]{{"setSerializeNulls", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 2), new String[][]{{"setSerializeNulls", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "TITLE"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"minute"}, false, 0, null, 3), new String[][]{{"endArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"]"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<null>"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "+"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-1"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "minutf"}, {"com.google.gson.stream.JsonWriter", "flush", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1eE10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1eE10"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<null>"}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1ee12"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"0xFFGFFFFF"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}}, 2), new String[][]{{"value", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"L0.FFGFFFFF"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "beginObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"I1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}}, 2), new String[][]{{"value", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"J"}, false, 0, null, 2), new String[][]{{"getSerializeNulls", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}, {"fromJsonTree", "com.google.gson.JsonElement", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"o<a>b</a=Incoomolue document"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "1eE10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "name", new String[]{"java.lang.String"}, new String[]{"7"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "I"}, {"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "_"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "_"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}}, 2), new String[][]{{"value", "java.lang.Number", "7"}, {"setLenient", "boolean", "2"}, {"setLenient", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "value", "double", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "double", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "hourOfDay"}}, 2), new String[][]{{"close", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Hello, World"}, {"com.google.gson.stream.JsonWriter", "value", "long", "-9223372036854775808"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "PT1H"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<d:1.04>"}}, 2), new String[][]{{"isHtmlSafe", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "1.7976931348623157E308"}}, 3), new String[][]{{"jsonValue", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}}, 3), new String[][]{{"setSerializeNulls", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 3), new String[][]{{"setHtmlSafe", "boolean", "5"}, {"value", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "7"}, {"com.google.gson.stream.JsonWriter", "close", ""}}, 1), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false), new String[][]{{"close", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"close", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}), new String[][]{{"close", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ".5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "name", new String[]{"java.lang.String"}, new String[]{"5."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"nullValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"nullValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"nullValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"value", "double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"value", "java.lang.Boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}), new String[][]{{"value", "java.lang.Boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Boolean", "<null>"}, {"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}), new String[][]{{"value", "java.lang.Boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"close", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endArray", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonNull", actual.getClass().getName());
  assertEquals("null {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharac...#615#1272262394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.76>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"getSerializeNulls", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.76>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "-1.5"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"getSerializeNulls", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "0.0"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "-\t.5"}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "1/1234567890123456"}, {"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", "\nIncomplete document"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"]"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"["}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"_"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "nullValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<null>", "<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"1.51.]1234567890"}, false), new String[][]{{"endArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "flush", ""}, {"com.google.gson.stream.JsonWriter", "close", ""}}), new String[][]{{"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setIndent", "java.lang.String", "1L"}, {"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-9223372036854775808"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}}), new String[][]{{"beginArray", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "long", "1"}, {"com.google.gson.internal.bind.JsonTreeWriter", "setIndent", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"0xFFGFFFFF"}, false, 12, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}}), new String[][]{{"value", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<empty>", "<sample:3>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:6>", "<null>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:7>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}}), new String[][]{{"endObject", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "_"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "_"}}), new String[][]{{"value", "java.lang.Number", "7"}, {"setLenient", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<null>", "<sample:0>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "hourOfDy"}}), new String[][]{{"close", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "nullValue", ""}}), new String[][]{{"beginObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.0"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "true"}, {"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "1.123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:0>", "<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Hello, World"}, {"com.google.gson.stream.JsonWriter", "value", "long", "-9223372036854775808"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<i:-255>"}}), new String[][]{{"isHtmlSafe", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "nullValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"value", "double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}), new String[][]{{"flush", "", "6"}, {"isHtmlSafe", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"-52"}, false), new String[][]{{"jsonValue", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}}), new String[][]{{"setSerializeNulls", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}}), new String[][]{{"setSerializeNulls", "boolean", "2"}, {"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-63.73000000000001>"}, false, 9, new String[][]{}, 2), new String[][]{{"getSerializeNulls", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 14, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{".d"}, false), new String[][]{{"value", "double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1ee12"}, false), new String[][]{{"getSerializeNulls", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "-1"}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}), new String[][]{{"nullValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "-1"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}), new String[][]{{"nullValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "140737488355340"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "y5"}}), new String[][]{{"get", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "140737488355340"}, {"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "y5"}}), new String[][]{{"close", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false), new String[][]{{"isLenient", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"0"}, false), new String[][]{{"endObject", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "-99.60999999999999"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}}, 1), new String[][]{{"get", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 10, new String[][]{}), new String[][]{{"get", "", "4"}, {"isJsonArray", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 3), new String[][]{{"isLenient", "", "4"}, {"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"isHtmlSafe", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "beginArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<d:-1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", ".5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"jsonValue", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"00x1F"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 1), new String[][]{{"setIndent", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"001F"}, false, 4, new String[][]{}, 1), new String[][]{{"setHtmlSafe", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1ee11"}, false, 5, new String[][]{}, 1), new String[][]{{"endArray", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1ee1\r"}, false, 5, new String[][]{}, 1), new String[][]{{"endArray", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<d:-0.76>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 30, new String[][]{}), new String[][]{{"setHtmlSafe", "boolean", "4"}, {"jsonValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 30, new String[][]{}), new String[][]{{"setSerializeNulls", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 34, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"40"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonNull", actual.getClass().getName());
  assertEquals("null {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharac...#615#1272262394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"getAsJsonArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endArray", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<empty>", "<sample:6>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "Expecting number, got: "}}, 2), new String[][]{{"getSerializeNulls", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"-34359738368"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "Expecting!number, got: month"}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}}), new String[][]{{"getAsInt", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.String", "Siglxe"}}), new String[][]{{"nullValue", "", "1"}, {"get", "", "3"}, {"getAsInt", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}), new String[][]{{"setHtmlSafe", "boolean", "2"}, {"value", "java.lang.String", "6"}, {"beginObject", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{",adapter="}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "Infinity"}}), new String[][]{{"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{",adbpter<"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "Infinity"}}, 1), new String[][]{{"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "0x123456789"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 28, new String[][]{}), new String[][]{{"beginArray", "", "7"}, {"setLenient", "boolean", "2"}, {"jsonValue", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 28, new String[][]{}, 1), new String[][]{{"beginArray", "", "7"}, {"value", "java.lang.Boolean", "2"}, {"jsonValue", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 29, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 2), new String[][]{{"setSerializeNulls", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.5>"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "1.5"}}), new String[][]{{"setSerializeNulls", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3), new String[][]{{"getSerializeNulls", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<null>", "<sample:3>", "<sample:3>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<null>", "<sample:0>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<empty>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<empty>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"`aaaed]a"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "beginArray", ""}}), new String[][]{{"setSerializeNulls", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
