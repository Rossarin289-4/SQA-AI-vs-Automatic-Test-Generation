package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:6>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findBackReference", "java.lang.String", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:4>", "<sample:8>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", "java.lang.String", "10+"}}, 2), new String[][]{{"getObjectIdReader", "", "0"}, {"getNullValue", "", "7"}, {"getValueInstantiator", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", actual.getClass().getName());
  assertEquals("{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:5>", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", "java.lang.String", "1.5d"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:6>", "<sample:0>", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.deser.NullValueProvider", "java.lang.Boolean"}, new String[]{"<null>", "<sample:0>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findBackReference", "java.lang.String", ""}}), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:1>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:6>"}, false, 11, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"500"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "Z"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", ""}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "\n"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"Thtke"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"ThtkeD"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<d:-0.5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "{\"a\":1}"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"-18014398509481982"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:4>", "<sample:2>", "true"}}, 3), new String[][]{{"createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:4>", "<sample:2>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:4>", "<sample:2>", "true"}}, 1), new String[][]{{"createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:4>", "<sample:2>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:1>", "<sample:7>", "<d:1.5>", "abc"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<s:>", "2.5Emght]tp://fxample.co/a??b=c"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<null>", "false"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:6>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findBackReference", "java.lang.String", "1"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<i:0>", "123456789012345678901234567890"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "15+"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"\n\n"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"isEnumType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"isEnumType", "", "7"}, {"getTypeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:6>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<null>", "<sample:4>", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "a"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<null>", "<sample:4>", "<sample:1>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>"}, false, 3, new String[][]{}, 3), new String[][]{{"getNullAccessPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:5>", "<sample:1>", "<sample:4>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<i:0>", "1.e3000a123466789"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.deser.NullValueProvider", "java.lang.Boolean"}, new String[]{"<sample:1>", "<sample:1>", "<sample:7>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:2>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:0>", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1L"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:7>", "<null>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:4>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "i"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:5>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:6>"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<i:-1>", "Title"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:4>", "<sample:8>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:8>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:6>", "<sample:8>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}}, 2), new String[][]{{"isCachable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:8>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:6>", "<sample:8>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}}, 2), new String[][]{{"isCachable", "", "1"}, {"getEmptyAccessPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:7>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:6>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:5>", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:8>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:5>", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 1), new String[][]{{"isCachable", "", "3"}, {"getEmptyAccessPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:3>", "false", "<null>", "1.5e300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "[1,2]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "<sample:4>", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"I1 "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "<sample:0>", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"2.65g"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:4>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"2.5Emght]tp://fxample.co/a??b=c"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"15+"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findBackReference", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", "java.lang.String", "2.5Emght]tp://fxample.co/a??b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getObjectIdReader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "<sample:7>", "I"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:1>", "true", "<sample:2>", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "{\"a\":1}"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "{\"a\":1}I1 "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata", "<sample:0>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:5>", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:4>", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", actual.getClass().getName());
  assertEquals("{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#311#-229031103", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:4>", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", actual.getClass().getName());
  assertEquals("{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:4>", "<sample:3>", "true"}}), new String[][]{{"createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<s:>", "2.5Emght]tp://fxample.co/a??b=c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<s:>", "2.5Emght]tp://fxample.co/a??b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "1.12345678"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1.5f"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:4>", "false", "<empty>", "2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:4>", "<sample:3>", "<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "15+"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:4>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:6>", "<sample:1>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=ALWAYS_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:5>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:5>", "<sample:1>"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:5>", "<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.13345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1334567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.13345678902234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1334567890223457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"I1 "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"\n"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection-like type; class java.lang.Objec...#480#-45775080", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, $0 -> $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0$0>;, getTypeName=[map-like type; class java.lang.Object, $0 -> $0], h...#463#-1745081143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getContentType", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:6>", "<sample:0>"}}), new String[][]{{"isEnumType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:5>", "<sample:3>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:0>", "<sample:3>", "<sample:7>"}, false), new String[][]{{"getNullAccessPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:5>", "<sample:5>", "<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"getNullAccessPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("ALWAYS_NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "I1 "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "I1  "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<sample:0>", "<null>", "1.5e300"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "null"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.deser.NullValueProvider", "java.lang.Boolean"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1L"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.deser.NullValueProvider", "java.lang.Boolean"}, new String[]{"<sample:1>", "<sample:4>", "<sample:7>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:2>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:0>", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1L"}}), new String[][]{{"getContentDeserializer", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<b:true>", "1e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:b>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "2020-01-01"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:0>", "<null>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<null>", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:6>", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:7>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:5>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:3>", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:3>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:6>", "<sample:1>", "<sample:3>"}}), new String[][]{{"getKnownPropertyNames", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:8>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:6>", "<sample:8>", "<sample:3>"}}), new String[][]{{"isCachable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:8>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:6>", "<sample:8>", "<sample:3>"}}), new String[][]{{"isCachable", "", "1"}, {"handledType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:8>", "{\"a\":1}"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:8>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:6>", "<sample:1>", "<sample:3>"}}), new String[][]{{"isCachable", "", "1"}, {"getEmptyAccessPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:0>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}}, 1), new String[][]{{"isCachable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getObjectIdReader", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "0x1C3456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "0x1C3456789"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:0>", "true", "<sample:2>", "/a/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:0>", "true", "<sample:2>", "/a/b"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=a,shape=NUMBER_FLOAT,lenient=false,locale=sample,timezone=null) {getLenient=false, getPattern=a, getShape=NUMBER_FLOAT, hasLenient=true, hasLocale=true, hasPattern=true, hasSh...#245#-1404486745", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:0>", "true", "<sample:2>", "/a/b"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=BOOLEAN,lenient=false,locale=sample,timezone=sample) {getLenient=false, getPattern=, getShape=BOOLEAN, hasLenient=true, hasLocale=true, hasPattern=false, hasShape=true,...#235#78089850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:0>", "true", "<sample:2>", "/a/b"}}, 2), new String[][]{{"hasLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:0>", "true", "<sample:2>", "/a/b"}}), new String[][]{{"hasLenient", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:0>", "true", "<sample:2>", "/a/b"}}), new String[][]{{"hasLenient", "", "5"}, {"timeZoneAsString", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:2>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata", "<sample:0>", "<sample:5>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:0>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "-4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:7>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "-44"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:7>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-44.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:7>", "<sample:2>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", "java.lang.String", "true"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4.", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "9"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", "java.lang.String", "true"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", "java.lang.String", "true"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:6>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>", "<sample:0>"}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>", "<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", ""}}, 1), new String[][]{{"getObjectIdReader", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2020-01-01", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "1L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", ""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "1.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "2.5"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", "java.lang.String", "\t"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:2>", "<null>", "<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", new String[]{}, new String[]{}, false), new String[][]{{"containedTypeName", "int", "5"}, {"forcedNarrowBy", "java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"null"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"nul6"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"h1"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"214748364AA8"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:3>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "<sample:3>", "2020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"-63"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"58c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "{\"a\":1}"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection-like type; class java.lang.Objec...#480#-45775080", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, $0 -> $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0$0>;, getTypeName=[map-like type; class java.lang.Object, $0 -> $0], h...#463#-1745081143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", "java.lang.String", "/a/b"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:6>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:1>", "1L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:3>", "<sample:1>", "1L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:3>", "<s:key>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:7>", "true", "<null>", "1.5e300"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:3>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<i:-1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:6>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<i:-1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:7>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:7>", "true"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:2>", "<sample:9>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getNullAccessPattern", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:0>", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>", "<null>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", new String[]{}, new String[]{}, false), new String[][]{{"findSuperType", "java.lang.Class", "0"}, {"hasRawClass", "java.lang.Class", "2"}, {"getErasedSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "1.5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", ""}}), new String[][]{{"getNullAccessPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "t12:30:45"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "15+"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:2>", "<sample:1>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "15h"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:2>", "<sample:1>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
