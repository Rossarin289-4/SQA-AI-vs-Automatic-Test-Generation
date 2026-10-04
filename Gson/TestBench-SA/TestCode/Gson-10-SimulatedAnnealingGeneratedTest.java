package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<sample:1>", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<sample:1>", "false", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<null>", "true", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:6>"}, false, 6, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:6>"}, false, 6, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}}), new String[][]{{"fromJsonTree", "com.google.gson.JsonElement", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.JsonSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:6>"}, false, 6, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}}), new String[][]{{"nullSafe", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>", "<sample:6>"}, false, 6, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:3>"}, false, 6, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:0>", "<sample:5>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:5>", "false"}}, 2), new String[][]{{"fromJson", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.JsonSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:3>"}, false, 6, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:2>", "<sample:5>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:5>", "false"}}, 2), new String[][]{{"fromJson", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:3>"}, false, 7, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:2>", "<sample:5>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:5>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<null>", "<sample:10>"}, false, 7, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:4>", "<sample:5>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>", "<sample:2>"}, false), new String[][]{{"fromJson", "java.io.Reader", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:6>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:2>"}, false), new String[][]{{"toJsonTree", "java.lang.Object", "7"}, {"addProperty", "java.lang.String,java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonObject", actual.getClass().getName());
  assertEquals("{\"0\":\"0\"} {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsC...#620#-1400789983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<empty>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "true"}}), new String[][]{{"fromJsonTree", "com.google.gson.JsonElement", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<empty>", "false"}}, 3), new String[][]{{"fromJsonTree", "com.google.gson.JsonElement", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<empty>", "true"}}, 3), new String[][]{{"fromJsonTree", "com.google.gson.JsonElement", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.JsonSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<empty>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:2>", "false"}}, 3), new String[][]{{"write", "com.google.gson.stream.JsonWriter,java.lang.Object", "0"}, {"fromJson", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<empty>", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:1>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:3>"}}), new String[][]{{"toJson", "java.io.Writer,java.lang.Object", "0"}, {"fromJsonTree", "com.google.gson.JsonElement", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>", "<sample:5>"}, false, 3, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:3>"}}, 2), new String[][]{{"toJson", "java.io.Writer,java.lang.Object", "0"}, {"fromJsonTree", "com.google.gson.JsonElement", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<null>", "<sample:5>"}, false, 3, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:3>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}}, 2), new String[][]{{"toJson", "java.io.Writer,java.lang.Object", "0"}, {"toJson", "java.io.Writer,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>", "<sample:4>"}, false, 3, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:3>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<sample:2>", "true", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<sample:2>", "false", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<sample:2>", "false", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:2>", "<sample:3>"}}, 3), new String[][]{{"nullSafe", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:2>", "<sample:3>"}}), new String[][]{{"fromJsonTree", "com.google.gson.JsonElement", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:0>"}, false, 12, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:2>", "<sample:3>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:7>", "<sample:3>"}}), new String[][]{{"fromJsonTree", "com.google.gson.JsonElement", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:0>"}, false, 12, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:2>", "<sample:3>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:7>", "<sample:3>"}}), new String[][]{{"fromJsonTree", "com.google.gson.JsonElement", "1"}, {"read", "com.google.gson.stream.JsonReader", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<null>", "<sample:6>"}, false, 3, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<null>", "true"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:6>"}, false, 10, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<null>", "true"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"toJson", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:3>"}, false, 6, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<empty>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<empty>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:7>"}, false, 15, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:1>", "true"}}), new String[][]{{"toJsonTree", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonObject", actual.getClass().getName());
  assertEquals("{} {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAsCharacte...#613#-413588791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:3>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<sample:1>", "false", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"toJsonTree", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonObject", actual.getClass().getName());
  assertEquals("{\"value\":[],\"coder\":0,\"hash\":0} {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOper...#642#-551354059", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:5>", "<sample:3>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:1>", "false"}}, 2), new String[][]{{"fromJson", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<empty>", "false", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<null>", "<sample:7>"}, false, 4, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"toJsonTree", "java.lang.Object", "6"}, {"addProperty", "java.lang.String,java.lang.Number", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.gson.JsonObject", actual.getClass().getName());
  assertEquals("{\"a\":null} {getAsBigDecimal=!UnsupportedOperationException, getAsBigInteger=!UnsupportedOperationException, getAsBoolean=!UnsupportedOperationException, getAsByte=!UnsupportedOperationException, getAs...#621#-891414553", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean", "com.google.gson.internal.Excluder"}, new String[]{"<null>", "true", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:3>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:1>", "false"}}, 1), new String[][]{{"fromJson", "java.io.Reader", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.stream.MalformedJsonException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<null>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"toJson", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:4>", "<sample:1>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:5>", "true"}}), new String[][]{{"fromJson", "java.io.Reader", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:8>", "<sample:3>"}, false, 4, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:1>", "<sample:2>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:6>", "<sample:1>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:5>", "true"}}, 1), new String[][]{{"nullSafe", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:5>", "<sample:4>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:2>", "false"}}, 1), new String[][]{{"fromJson", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.EOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", new String[]{"java.lang.reflect.Field", "boolean"}, new String[]{"<null>", "true"}, false, 10, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:2>", "<sample:17>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:7>", "<sample:21>"}, false, 7, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<sample:7>", "<sample:4>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:2>"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:0>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:12>"}, false, 9, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<null>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:2>", "false"}, {"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "excludeField", "java.lang.reflect.Field,boolean", "<sample:1>", "true"}}), new String[][]{{"toJson", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", new String[]{"com.google.gson.Gson", "com.google.gson.reflect.TypeToken"}, new String[]{"<sample:0>", "<sample:12>"}, false, 3, new String[][]{{"com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", "create", "com.google.gson.Gson,com.google.gson.reflect.TypeToken", "<null>", "<sample:6>"}}, 2), new String[][]{{"fromJson", "java.io.Reader", "7"}, {"fromJsonTree", "com.google.gson.JsonElement", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.gson.JsonSyntaxException", thrown.getClass().getName());
 }
}
