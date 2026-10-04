package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"TITLD"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:0>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.deser.NullValueProvider", "java.lang.Boolean"}, new String[]{"<sample:9>", "<sample:0>", "<sample:5>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:1>", "<sample:3>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "1.123r567890134567"}}), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "3"}, {"getValueInstantiator", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", actual.getClass().getName());
  assertEquals("{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:2>", "<sample:2>", "<sample:3>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "/a/1", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", "int", "2145386495"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"0x1F/`/1"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:5>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean", "java.lang.Enum", "java.lang.String"}, new String[]{"<sample:7>", "true", "<sample:3>", "/a/1abc"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:7>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"W"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<i:-9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:5>", "<sample:5>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "<sample:6>", "0w1F"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", actual.getClass().getName());
  assertEquals("{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#314#1636553649", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"-60"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<d:-2.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", ".50xFFF"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:6>", "<sample:4>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getBindings", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"TiLtle", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:0>", "<sample:4>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("as content of type '[collection-like type; class java.lang.Object, contains $0]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"u"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"\tPW1H"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:8>", "Hello,\037Worlda"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "1.12334567"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:8>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", ""}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:3>", "<sample:9>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=ALWAYS_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>", "<sample:2>", "<sample:1>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<empty>", "<i:0>", "6."}}, 3), new String[][]{{"getNullAccessPattern", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("ALWAYS_NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"/a/b\u00ea"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:3>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>", "<sample:6>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:9>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "TITME"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean", "java.lang.Enum", "java.lang.String"}, new String[]{"<sample:4>", "false", "<sample:1>", "nuull"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "-"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "1.1234"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:6>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:0>", "<sample:3>"}, false, 7, new String[][]{}, 2), new String[][]{{"getLenient", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"abc/a/1"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:0>", "<sample:11>", "<empty>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "1.5e310"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:1>", "true", "<sample:1>", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:10>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:4>", "<sample:6>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "-33554431"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"I010", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:9>", "<sample:1>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:1>", "<i:-65536>", "-1.55"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:6>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"1.123456789012345672147483648--1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "1e10a,b,c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:6>", "<sample:6>", "<sample:2>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"\u00ea"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:C>", "<d:1.5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", "java.lang.String", "---11"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "0.E5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678901.12345678901234567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"null"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("as content of type '[map-like type; class java.lang.Object, $0 -> $0]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "1.5d"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "1eeE10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"-59"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5e3/0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<null>", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_reportFailedNullCoerce", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean", "java.lang.Enum", "java.lang.String"}, new String[]{"<sample:6>", "false", "<sample:2>", "a,b,c"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("for type '[simple type, class java.lang.Object]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "8L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "\u00ea"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "\u00e9\u00e91"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:7>", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "1.12345678902234567+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:5>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:4>", "<sample:10>", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:11>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "a -"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"f"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"12:30:451"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=NUMBER,lenient=null,locale=sample,timezone=null) {getLenient=null, getPattern=, getShape=NUMBER, hasLenient=false, hasLocale=true, hasPattern=false, hasShape=true, hasT...#230#-2023132170", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:8>", "<sample:11>", "<sample:0>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"2148483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1.1234567890234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:7>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0xFFFFFFFF\t", "<sample:5>"}}), new String[][]{{"getLenient", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection-like type; class java.lang.Objec...#480#-45775080", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyAccessPattern", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"f"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"+1/a/b"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:4>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1.45", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:1>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:9>", "<sample:9>", "<sample:0>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", ""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:2>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<null>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:1>", "true"}}), new String[][]{{"getShape", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Shape", actual.getClass().getName());
  assertEquals("NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:0>", "<sample:8>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "<sample:4>", "0160"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}), new String[][]{{"canCreateFromDouble", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<null>", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", "java.lang.String", "-1/5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("FAIL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "TITLD"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:3>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", ",1.55"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"-1071644672"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "` -"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:7>", "<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1TITLE"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", new String[]{}, new String[]{}, false), new String[][]{{"getParameterSource", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:10>", "<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:8>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:7>", "<i:-1>", "\""}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getObjectIdReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", ""}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:13>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", "java.lang.String", "TJTL"}}), new String[][]{{"getNullAccessPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "\t"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:9>", "<sample:4>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:-42>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"0x11.5f"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<d:1.5>", "true2020-01-01"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "0"}, {"createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", ""}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:3>", "<i:5>", "\u00e9L"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:8>", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:19>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"-61"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullAccessPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "-5.55"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.55", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", ""}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", "int", "-2147483598"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:10>", "<sample:5>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "0y123456789"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"-0.0\u00ea"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "<sample:4>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:-0.5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getNullValue", ""}}), new String[][]{{"findSuperType", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"12:30:451.1234567890123456"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"D-1"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "xbc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<null>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<i:-11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:-72>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-72", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"trueaaaaaaabaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:3>", "0xF2147483648"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:1>", "<i:-65536>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{".5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", "java.lang.Number", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "-"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "-5"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("for type `java.lang.Object`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<i:-15>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "0I\t"}}, 3), new String[][]{{"canCreateFromLong", "", "7"}, {"createFromBoolean", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:-0.29>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:6>", "<sample:5>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:-0.24>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:-0.562>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.562", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "1.1234567890123456"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:5>", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "1.572020-01-01"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"-38"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getObjectIdReader", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "trte"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_intOverflow", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("for type '[simple type, class java.lang.Object]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:6>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "ab1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:4>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Collection", "<sample:1>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"255"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:59>", "<i:-30>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{" u\u00ea"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", "java.lang.String", "\n9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyAccessPattern", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"2147483648aaaaaaaaaaaaaaaaaa8aaaaaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "withResolved", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.deser.NullValueProvider,java.lang.Boolean", "<sample:5>", "<sample:0>", "<sample:0>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:5>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "<a>b</`>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<sample:4>", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("FAIL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:12>", "<sample:8>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_deserializeWrappedValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "\u00e9"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"2147483601"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:5>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "-.55"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "TI?TLE"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:5>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:5>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:4>", "<sample:4>", "<s:>", "1.25--1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"."}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}}), new String[][]{{"canCreateFromBoolean", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:1>", "<i:-65472>", "a -"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isIntNumber", "java.lang.String", "true[1,2]0"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", actual.getClass().getName());
  assertEquals("{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#317#1180324081", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:7>", "<sample:3>", "<d:1.535>", "{\"a\":1}1.5d"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "handledType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", ".5"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "`<a>b</a>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", ";a>a</a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getContentType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getDelegatee", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("as content of type '[collection-like type; class java.lang.Object, contains $0]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDateFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:10>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "155"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("155.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_isNaN", "java.lang.String", "0{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base", actual.getClass().getName());
  assertEquals("{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#-1594774090", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
