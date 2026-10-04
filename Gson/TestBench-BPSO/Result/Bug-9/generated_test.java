package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"0.25"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "getSerializeNulls", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:0>", "<sample:4>", "<sample:2>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"46"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.1234567"}}), new String[][]{{"value", "double", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Missing field in"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "\n,adapter="}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"hourOfDay-0.0"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}), new String[][]{{"nullValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "1.1234568890123457"}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"4294967297"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "NaN"}}), new String[][]{{"getSerializeNulls", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "beginArray", ""}}), new String[][]{{"close", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"/`/b0xFFFFFFFF"}, false, 6, new String[][]{}), new String[][]{{"setSerializeNulls", "boolean", "6"}, {"endArray", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"0"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<null>"}}), new String[][]{{"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-1.46"}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endArray", ""}}), new String[][]{{"value", "boolean", "2"}, {"get", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("false {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=!NumberFormatException, getAsCharacter=f, getAsDouble=!NumberFormatException, getAs...#456#-595913014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}}, 1), new String[][]{{"flush", "", "2"}, {"close", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Boolean", "true"}}), new String[][]{{"jsonValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1"}, false), new String[][]{{"name", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 7, new String[][]{}), new String[][]{{"flush", "", "1"}, {"close", "", "7"}, {"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "52.0"}}), new String[][]{{"value", "java.lang.String", "4"}, {"get", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("\"\" {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=!NumberFormatException, getAsCharacter=!StringIndexOutOfBoundsException, getAsDouble=!...#461#-76994601", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}), new String[][]{{"setIndent", "java.lang.String", "4"}, {"setLenient", "boolean", "1"}, {"setHtmlSafe", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:1>", "<sample:5>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}, {"read", "com.google.gson.stream.JsonReader", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"12:30O45"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "-3.595"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-5.9>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "close", ""}}), new String[][]{{"setHtmlSafe", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-9.4>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "tmonth"}}, 3), new String[][]{{"value", "double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:-8>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}}), new String[][]{{"value", "boolean", "1"}, {"setHtmlSafe", "boolean", "0"}, {"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("true {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=true, getAsByte=!NumberFormatException, getAsCharacter=t, getAsDouble=!NumberFormatException, getAsFl...#453#1710900707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "Titf"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"<null>"}, false), new String[][]{{"value", "java.lang.Number", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"close", "", "4"}, {"close", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}, {"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}}, 2), new String[][]{{"get", "", "6"}, {"getAsJsonArray", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"9223372036854775807"}, false), new String[][]{{"close", "", "6"}, {"flush", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "a b\013"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.5-1.5"}}), new String[][]{{"value", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}), new String[][]{{"close", "", "5"}, {"name", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "Infinity"}, {"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}}, 3), new String[][]{{"value", "java.lang.Number", "6"}, {"value", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:8>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:4>", "<empty>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}, {"fromJson", "java.io.Reader", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}, {"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567hourOfDay"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}, {"com.google.gson.stream.JsonWriter", "endObject", ""}}, 3), new String[][]{{"isHtmlSafe", "", "4"}, {"endArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"name", "java.lang.String", "6"}, {"nullValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"-a1.4"}, false, 1, new String[][]{}, 1), new String[][]{{"setSerializeNulls", "boolean", "6"}, {"flush", "", "3"}, {"nullValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "7"}, {"fromJsonTree", "com.google.gson.JsonElement", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}), new String[][]{{"get", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonArray", actual.getClass().getName());
  assertEquals("[null] {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsChar...#617#1971553804", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}}, 1), new String[][]{{"setHtmlSafe", "boolean", "5"}, {"close", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}}), new String[][]{{"nullValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 1), new String[][]{{"value", "java.lang.String", "0"}, {"value", "double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"Factory[typeHierarchy=Incomplete documentCouldn't write "}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", "a b"}, {"com.google.gson.stream.JsonWriter", "value", "long", "-562949953421311"}}), new String[][]{{"beginArray", "", "2"}, {"get", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}, {"com.google.gson.stream.JsonWriter", "value", "java.lang.String", "1.1p34567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", ""}}, 2), new String[][]{{"beginObject", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", "Incomplete document-0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}, 3), new String[][]{{"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("false {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=!NumberFormatException, getAsCharacter=f, getAsDouble=!NumberFormatException, getAs...#456#-595913014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"{\"a\":11}"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "long", "-9223372032559808512"}, {"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "-1TITLE"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"1Ltrue"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endArray", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-2.9200000000000004"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}}, 3), new String[][]{{"setSerializeNulls", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"\t-1"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setIndent", "java.lang.String", "pecod"}, {"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "false"}, {"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}, 1), new String[][]{{"close", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"beginArray", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<empty>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "nullValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonNull", actual.getClass().getName());
  assertEquals("null {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharac...#615#1272262394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3), new String[][]{{"get", "", "7"}, {"getAsLong", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", "1.12345678901234567hourOfDay"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"jsonValue", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 3, new String[][]{}, 1), new String[][]{{"value", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-144115188075855873"}, false, 0, null, 3), new String[][]{{"flush", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"closed"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", "0xFFFFFFFF"}}, 1), new String[][]{{"setHtmlSafe", "boolean", "3"}, {"get", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "name", "java.lang.String", " but was "}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "name", new String[]{"java.lang.String"}, new String[]{"Missing field in "}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 4, new String[][]{}, 3), new String[][]{{"value", "long", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "name", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "1.12345678T0123456Title"}}, 3), new String[][]{{"beginArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567hourOfDay0x123456789"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endArray", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-8589934592"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "nullValue", ""}}, 2), new String[][]{{"setIndent", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"isLenient", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:3>", "<sample:11>"}, true, 0, null, 2), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"25"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "name", new String[]{"java.lang.String"}, new String[]{"a,b,"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"Couldn'3t write Incomplete document"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaa`aaaaaaa"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "hourOfDay"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "name", "java.lang.String", "Couldn't write "}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"value", "java.lang.Boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"0x123456[789"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "long", "9223372036854775807"}}), new String[][]{{"setHtmlSafe", "boolean", "1"}, {"isLenient", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"null010"}, false, 3, new String[][]{}), new String[][]{{"value", "boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"-144115188075855873"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}}), new String[][]{{"nullValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "jsonValue", "java.lang.String", "secod"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"+2"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}), new String[][]{{"value", "long", "1"}, {"value", "java.lang.Boolean", "7"}, {"endArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-2.7"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:-9.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:8>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"value", "boolean", "7"}, {"nullValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"0w"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"112345678901234567"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "close", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<null>", "<sample:8>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-1.4600000000000002"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:1>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "nullValue", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonNull", actual.getClass().getName());
  assertEquals("null {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharac...#615#1272262394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}), new String[][]{{"setSerializeNulls", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"nnulla"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"ckosedd"}, false), new String[][]{{"jsonValue", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "1.7976931348623157E308"}, {"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"get", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false), new String[][]{{"value", "double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-1"}, false), new String[][]{{"value", "java.lang.Number", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-1.3050000000000002"}, false, 7, new String[][]{}), new String[][]{{"get", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("-1.3050000000000002 {getAsBigDecimal=-1.3050000000000002, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=-1, getAsCharacter=-, getAsDouble=-1.3050000000000002, getAsFloat=-1.305...#383#1901942561", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}), new String[][]{{"get", "", "6"}, {"isJsonPrimitive", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactoryForMultipleTypes", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:4>", "<sample:0>", "<null>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"50"}, false, 4, new String[][]{}), new String[][]{{"setHtmlSafe", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "long", "-70403103916007"}}), new String[][]{{"endObject", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "endObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "close", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"-16"}, false, 1, new String[][]{}), new String[][]{{"isLenient", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "nullValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"1.1p34567"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"close", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false), new String[][]{{"setLenient", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("true {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=true, getAsByte=!NumberFormatException, getAsCharacter=t, getAsDouble=!NumberFormatException, getAsFl...#453#1710900707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"-2.2"}, false, 4, new String[][]{}), new String[][]{{"jsonValue", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false), new String[][]{{"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonNull", actual.getClass().getName());
  assertEquals("null {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharac...#615#1272262394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"jsonValue", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "nullValue", new String[]{}, new String[]{}, false), new String[][]{{"get", "", "0"}, {"isJsonArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-1.0"}, false), new String[][]{{"isHtmlSafe", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-0.5000000000000001"}, false, 3, new String[][]{}), new String[][]{{"get", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("-0.5000000000000001 {getAsBigDecimal=-0.5000000000000001, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=0, getAsCharacter=-, getAsDouble=-0.5000000000000001, getAsFloat=-0.5, g...#377#217752708", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"Helo, Worlc"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"day"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"Incomplete docunent"}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "i"}}), new String[][]{{"flush", "", "5"}, {"value", "double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginObject", new String[]{}, new String[]{}, false), new String[][]{{"value", "java.lang.Number", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"java.lang.Class", "java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:0>", "<sample:1>", "<sample:2>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"abbc"}, false, 4, new String[][]{}), new String[][]{{"beginObject", "", "7"}, {"getSerializeNulls", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false), new String[][]{{"setLenient", "boolean", "5"}, {"setLenient", "boolean", "2"}, {"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("true {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=true, getAsByte=!NumberFormatException, getAsCharacter=t, getAsDouble=!NumberFormatException, getAsFl...#453#1710900707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}}), new String[][]{{"getAsShort", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:7>", "<sample:0>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.Gson$FutureTypeAdapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false), new String[][]{{"isLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setSerializeNulls", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"value", "boolean", "4"}, {"getSerializeNulls", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}}), new String[][]{{"value", "java.lang.String", "3"}, {"value", "java.lang.Boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "true"}}), new String[][]{{"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:6>", "<sample:1>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "endObject", ""}}), new String[][]{{"setSerializeNulls", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "nullValue", ""}}), new String[][]{{"isHtmlSafe", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-0.0"}, false), new String[][]{{"endArray", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "nullValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isHtmlSafe", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"get", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setIndent", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "java.lang.Number", "<i:-29>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"long"}, new String[]{"0"}, false, 0, null, 3), new String[][]{{"get", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("0 {getAsBigDecimal=0, getAsBigInteger=0, getAsBoolean=false, getAsByte=0, getAsCharacter=0, getAsDouble=0.0, getAsFloat=0.0, getAsInt=0, getAsLong=0, getAsNumber=0, getAsShort=0, getAsString=0, isBool...#267#-1744633550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"Missing field in 1.1234567890123456"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.12345678"}, {"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}}), new String[][]{{"setHtmlSafe", "boolean", "0"}, {"get", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("true {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=true, getAsByte=!NumberFormatException, getAsCharacter=t, getAsDouble=!NumberFormatException, getAsFl...#453#1710900707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"get", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newFactory", new String[]{"com.google.gson.reflect.TypeToken", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"Factorry[typeHierarchy="}, false, 6, new String[][]{}), new String[][]{{"setIndent", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"25"}, false), new String[][]{{"getSerializeNulls", "", "5"}, {"getSerializeNulls", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 3), new String[][]{{"get", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("true {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=true, getAsByte=!NumberFormatException, getAsCharacter=t, getAsDouble=!NumberFormatException, getAsFl...#453#1710900707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 6, new String[][]{}), new String[][]{{"getSerializeNulls", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endArray", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<d:-1.0>"}, false, 6, new String[][]{}), new String[][]{{"setHtmlSafe", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{}), new String[][]{{"setLenient", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"0"}, false), new String[][]{{"getSerializeNulls", "", "5"}, {"close", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"Factory[type="}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"a"}, false), new String[][]{{"get", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("\"a\" {getAsBigDecimal=!NumberFormatException, getAsBigInteger=!NumberFormatException, getAsBoolean=false, getAsByte=!NumberFormatException, getAsCharacter=a, getAsDouble=!NumberFormatException, getAsFl...#433#-757625048", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<i:-2>"}}), new String[][]{{"getAsJsonNull", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setIndent", "java.lang.String", "\n"}, {"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.TypeAdapters", "com.google.gson.internal.bind.TypeAdapters", "newTypeHierarchyFactory", new String[]{"java.lang.Class", "com.google.gson.TypeAdapter"}, new String[]{"<sample:5>", "<sample:7>"}, true), new String[][]{{"create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "4"}, {"fromJsonTree", "com.google.gson.JsonElement", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setSerializeNulls", "boolean", "true"}}), new String[][]{{"setSerializeNulls", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=false, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "beginArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "close", ""}}, 2), new String[][]{{"endArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "getSerializeNulls", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-1.3050000000000004"}, false, 2, new String[][]{}, 1), new String[][]{{"value", "long", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false), new String[][]{{"isHtmlSafe", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 5, new String[][]{}, 2), new String[][]{{"isHtmlSafe", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}}), new String[][]{{"isLenient", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "get", ""}}), new String[][]{{"jsonValue", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "nullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "getSerializeNulls", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "flush", ""}}), new String[][]{{"get", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonNull", actual.getClass().getName());
  assertEquals("null {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharac...#615#1272262394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "name", new String[]{"java.lang.String"}, new String[]{"H"}, false, 5, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}}), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"get", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "long", "-53"}, {"com.google.gson.internal.bind.JsonTreeWriter", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonPrimitive", actual.getClass().getName());
  assertEquals("-53 {getAsBigDecimal=-53, getAsBigInteger=-53, getAsBoolean=false, getAsByte=-53, getAsCharacter=-, getAsDouble=-53.0, getAsFloat=-53.0, getAsInt=-53, getAsLong=-53, getAsNumber=-53, getAsShort=-53, g...#289#-1617274458", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"endArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{}, 1), new String[][]{{"value", "boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.stream.JsonWriter", "value", "long", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setSerializeNulls", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", new String[]{"java.lang.String"}, new String[]{"II"}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isHtmlSafe", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.gson.stream.JsonWriter", "isHtmlSafe", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "setIndent", "java.lang.String", "1.5e300"}, {"com.google.gson.stream.JsonWriter", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 6, new String[][]{{"com.google.gson.stream.JsonWriter", "endArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "nullValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "close", ""}, {"com.google.gson.internal.bind.JsonTreeWriter", "value", "double", "-0.7950000000000002"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "value", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 6, new String[][]{}), new String[][]{{"setLenient", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.JsonTreeWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.String"}, new String[]{"horOfDay"}, false, 3, new String[][]{}), new String[][]{{"setHtmlSafe", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"long"}, new String[]{"1048575"}, false, 1, new String[][]{{"com.google.gson.stream.JsonWriter", "setHtmlSafe", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonWriter", actual.getClass().getName());
  assertEquals("{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "beginArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "setLenient", "boolean", "true"}}), new String[][]{{"isLenient", "", "1"}, {"close", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.stream.JsonWriter", "com.google.gson.stream.JsonWriter", "value", new String[]{"java.lang.Boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.google.gson.stream.JsonWriter", "isLenient", ""}}), new String[][]{{"isLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeWriter", "com.google.gson.internal.bind.JsonTreeWriter", "setHtmlSafe", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeWriter", "value", "java.lang.Number", "<i:1>"}, {"com.google.gson.internal.bind.JsonTreeWriter", "jsonValue", "java.lang.String", ",adapte0="}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSerializeNulls=true, isHtmlSafe=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
