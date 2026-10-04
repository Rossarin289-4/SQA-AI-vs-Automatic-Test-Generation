package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:10>", "<sample:2>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<i:1>", "T1H"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"2147483648Hello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:10>", "<sample:2>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", "java.lang.String", "z\"a\":1]}"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"21e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"Iello+ World"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:11>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:4>", "<sample:7>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "<a>b/`>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"x1E"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1.1235567>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", "java.lang.String", "2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:9>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"=0.F0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:6>", "<null>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", "java.lang.String", "a,1b,c"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", "java.lang.String", "1e10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:2>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"aac"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "<sample:4>", "1e10"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:7>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", "java.lang.String", "2P474\r3648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:10>", "<null>", "1.1234567"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"Hello, Worle"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF123456789012345678901234567890"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"`"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", "java.lang.String", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "<sample:4>", "1.123456780"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "<sample:9>", "0x223456789"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:7>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getDelegatee", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", "java.lang.String", "a b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:5>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "<sample:7>", ".5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "1.1234567890123456"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1234567890123D4567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", "java.lang.String", "1.1234566"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:6>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:10>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1.5e"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", "java.lang.String", "1e1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:9>", "<s:W>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:10>", "<sample:8>", "<s:kex>", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<sample:1>", "PT1I"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "{\"`\":1}"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", "java.lang.String", "0010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<null>", "<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", "java.lang.String", "H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"1.12345679"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:7>", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", "java.lang.String", "-1.51.5d"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:2>", "<sample:7>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{".51"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "<sample:2>", "1f0"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:7>", "Tite"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", "java.lang.String", "_"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:1>", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", ""}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:2>", "<s:b>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "0x123456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:10>", "<sample:1>", "<i:1>", "a,b,c"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", "java.lang.String", "PT1H"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:13>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", "java.lang.String", "i1.1234567"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", ""}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "<sample:7>", "2l2:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:7>", "1.1234567891123456"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"PU1m"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:5>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:5>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "<i:1>", "null"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:6>", "<i:1>", "1.1234567901234567"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", "java.lang.String", "2020-02-30T25:61:61"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:1>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", "java.lang.String", "--1i"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:8>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"123456789002345678901234567890"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"0xmFFFFFFF"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:2>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 3), new String[][]{{"getNullValue", "", "6"}, {"getKnownPropertyNames", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"1.12345678901234561.5"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "<sample:5>", "1234567890123425678901234567890"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:13>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:4>", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<null>", "<sample:4>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", "java.lang.String", "Hello, World"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:4>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"isCachable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<null>", "<s:a>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "<sample:7>", "huttp://example.com/a?b=c"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>"}}), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"0.b12345678"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:10>", "<sample:4>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", "java.lang.String", "i1.5f"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:14>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:12>", "<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:4>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{".46"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", "java.lang.String", ""}}), new String[][]{{"getValueClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", "java.lang.String", "Hello, Wrorld-1"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:6>", "<s:b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"11234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567E7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", "java.lang.String", "15"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2), new String[][]{{"findBackReference", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNaN", "java.lang.String", "`bcnull"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "+1-10x123456789"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{".5"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isCachable", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:3>", "<sample:2>", "<s:`>", "abc"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_hasTextualNull", "java.lang.String", "0wFFFFFFFF1.25"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"getValueClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "true\u00e9"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getValueType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isIntNumber", "java.lang.String", ""}}, 3), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getDelegatee", ""}}, 2), new String[][]{{"getDelegatee", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-00."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", "java.lang.String", " "}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findBackReference", "java.lang.String", "4."}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61;61"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"PTH"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "/5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:3>", "<sample:2>"}}, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}), new String[][]{{"isCachable", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:4>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_isNegInf", "java.lang.String", "1..5d"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "getObjectIdReader", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "handledType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"8234567890123456789012345167890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.234567890123456E30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:13>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:9>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}}, 3), new String[][]{{"findBackReference", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"5.d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:1>", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
