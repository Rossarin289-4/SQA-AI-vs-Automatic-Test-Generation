package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 26, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "doPeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "doPeek", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 26, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 27, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "isLenient", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NUMBER", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "doPeek", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BOOLEAN", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("STRING", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 30, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "doPeek", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!ArrayIndexOutOfBoundsException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "doPeek", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.AssertionError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 30, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NUMBER", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BOOLEAN", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("STRING", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!ArrayIndexOutOfBoundsException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!ArrayIndexOutOfBoundsException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginArray", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$.", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "isLenient", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "beginObject", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 12, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endArray", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "isLenient", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NUMBER", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "isLenient", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BOOLEAN", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "promoteNameToValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "setLenient", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!ArrayIndexOutOfBoundsException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "doPeek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "toString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "isLenient", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BEGIN_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("END_DOCUMENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextInt", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 38, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "false"}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "hasNext", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "close", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$., hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("BOOLEAN", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!ArrayIndexOutOfBoundsException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextNull", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "hasNext", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$[0], hasNext=false, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "isLenient", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "toString", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("JsonTreeReader", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!IllegalStateException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "isLenient", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("STRING", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "peek", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "endArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.gson.stream.JsonToken", actual.getClass().getName());
  assertEquals("NUMBER", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "getPath", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextString", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=!ArrayIndexOutOfBoundsException, isLenient=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "peek", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "endObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "false"}, {"com.google.gson.internal.bind.JsonTreeReader", "nextBoolean", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextLong", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "skipValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginArray", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextInt", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}, {"com.google.gson.internal.bind.JsonTreeReader", "isLenient", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "beginObject", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "setLenient", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "JsonTreeReader {getPath=$, hasNext=true, isLenient=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "getPath", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.JsonTreeReader", "com.google.gson.internal.bind.JsonTreeReader", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.gson.internal.bind.JsonTreeReader", "nextDouble", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "skipValue", ""}, {"com.google.gson.internal.bind.JsonTreeReader", "nextName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
