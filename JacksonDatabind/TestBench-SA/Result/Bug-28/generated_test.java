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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "1.12345678911234567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<sample:7>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<sample:7>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>", "<sample:0>", "<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "<null>", "-0.0"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "1.1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<null>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>", "1.251.5e300", "<sample:2>", "<sample:5>", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:2>", "<null>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "5"}, {"getEmptyValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "5"}, {"getEmptyValue", "", "7"}, {"elements", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"findBackReference", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>", "<sample:7>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:4>", "<sample:3>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:2>", "<i:0>"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"<a>b/a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<null>", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:6>", "<sample:0>", "<i:1>", "123456789012345678901234567890"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}, {"getObjectIdReader", "", "6"}, {"findBackReference", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"getNullValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"getNullValue", "", "7"}, {"has", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", "java.lang.String", "2020-01-01"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"getValueType", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:2>", "<sample:5>", "<s:>", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:9>", "<null>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:2>", "<sample:5>", "<s:>", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:9>", "<null>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"P]fzH?"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", "java.lang.String", "1e10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:7>", "<sample:1>", "<s:a>", "1.12345678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:7>", "<sample:1>", "<s:a>", "1.12345678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "{.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "<sample:4>", "{.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "<sample:2>", "Hello, World"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:5>", "<sample:0>", "<sample:0>", "1.5d"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:2>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:2>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "<sample:2>", "Hello, World"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:5>", "<sample:0>", "<sample:0>", "1.5d"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:2>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.String"}, new String[]{"<sample:3>", "Hkko World"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, null, 3), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:1>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"[1 fc]/xFFFcFFFF"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:7>", "<sample:1>", "<sample:5>", "0xFFFFFFFF", "<sample:7>", "<null>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:7>", "<null>", "<sample:5>", "0xFFFFFFFF", "<sample:5>", "<null>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "<sample:4>", "1.1234567890123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "<sample:5>", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "/a/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory,java.lang.String,com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode,com.fasterxml.jackson.databind.JsonNode", "<sample:0>", "<sample:0>", "<sample:1>", "1.12345678901234567", "<sample:1>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", "java.lang.String", "abc"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:9>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:0>", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "<null>", "-0.0"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:1>", "<null>", "<sample:5>", "1.25", "<sample:2>", "<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:1>", "<sample:0>", "<sample:5>", "1.25", "<sample:2>", "<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<null>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"getObjectIdReader", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"getEmptyValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "<sample:4>", "TITLE"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:1>", "<i:-1>", "Title"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"findBackReference", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "<sample:6>", "+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"asLong", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"asLong", "long", "1"}, {"at", "java.lang.String", "4"}, {"isDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"0xFFFnGFFF"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"+1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", ""}}), new String[][]{{"asLong", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.String"}, new String[]{"<null>", "12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false), new String[][]{{"isBigInteger", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:3>", "<sample:0>", "<s:b>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:2>", "<sample:5>", "<i:-1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "2020-01-01"}}), new String[][]{{"asToken", "", "4"}, {"isFloat", "", "7"}, {"has", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<null>", "<sample:6>"}, false, 15, new String[][]{}), new String[][]{{"asToken", "", "4"}, {"isFloat", "", "7"}, {"findParents", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<sample:6>", "<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}}), new String[][]{{"asToken", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:7>", "<sample:0>", "<s:a>", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "1.5d"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false), new String[][]{{"decimalValue", "", "0"}, {"findValue", "java.lang.String", "5"}, {"isLong", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:3>", "<i:-1>", "{\"a\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.String"}, new String[]{"<sample:0>", "Hello, World"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:4>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:4>", "<sample:6>", "<s:a>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:0>", "<sample:5>"}}), new String[][]{{"intValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", "java.lang.String", "{\"a\":1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"1.12344678901B23456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<sample:4>", "<i:2>", "1.12345678901234567"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "2147483648"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", "java.lang.String", "1i"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<null>"}}), new String[][]{{"isTextual", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false), new String[][]{{"asDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 1), new String[][]{{"asDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:4>", "TITLE"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:5>", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"a0xF<FFF"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:2>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"a0xF<FFF"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:1>", "<sample:4>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false), new String[][]{{"get", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", "com.fasterxml.jackson.core.JsonParser,java.lang.String", "<sample:1>", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:3>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:6>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:1>", "<sample:1>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<sample:3>", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<sample:0>", "<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:2>", "<sample:10>"}, false, 0, null, 1), new String[][]{{"findValues", "java.lang.String,java.util.List", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"findValues", "java.lang.String,java.util.List", "3"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<null>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:3>", "<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", "java.lang.String", "1.25"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"+11.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"+11.1345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.1345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"+11.1345668"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.1345668", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<null>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"110"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("110.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"2null"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"4 "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:4>", "<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "+1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:4>", "<sample:5>", "<sample:0>"}}), new String[][]{{"getEmptyValue", "", "1"}, {"iterator", "", "3"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:2>", "<a>b</a>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:2>", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"getEmptyValue", "", "1"}, {"iterator", "", "3"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:6>", "<sample:0>"}}, 1), new String[][]{{"getEmptyValue", "", "1"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>", "<sample:6>", "<null>"}}, 1), new String[][]{{"getEmptyValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:5>", "<sample:2>"}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:4>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}}), new String[][]{{"isNull", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:1>", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}, 3), new String[][]{{"isTextual", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}), new String[][]{{"isTextual", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}), new String[][]{{"findValuesAsText", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:8>", "<sample:1>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:7>", "<sample:4>", "<sample:1>", "PT1H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>"}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", "java.lang.String", "-1\n"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", "java.lang.String", "-1\n"}}, 1), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false), new String[][]{{"getObjectIdReader", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "["}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.163567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.163567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-.163567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.163567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:3>", "<sample:5>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"247983648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.47983648E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"237983648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.37983648E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"2147"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2147.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:5>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<null>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:0>", "<sample:4>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"getNullValue", "", "0"}, {"elements", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true), new String[][]{{"getNullValue", "", "0"}, {"booleanValue", "", "4"}, {"isNumber", "", "1"}, {"isNull", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"getNullValue", "", "0"}, {"booleanValue", "", "4"}, {"isNumber", "", "1"}, {"isNull", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"getNullValue", "", "0"}, {"booleanValue", "", "4"}, {"findValuesAsText", "java.lang.String", "1"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"getNullValue", "", "0"}, {"booleanValue", "", "3"}, {"findValuesAsText", "java.lang.String", "1"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"getNullValue", "", "0"}, {"booleanValue", "", "3"}, {"findValuesAsText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"getNullValue", "", "0"}, {"has", "java.lang.String", "4"}, {"canConvertToInt", "", "3"}, {"asLong", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getNullValue", "", "0"}, {"has", "java.lang.String", "4"}, {"asBoolean", "boolean", "1"}, {"asLong", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "a"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "<i:0>", "5."}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:2>", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "-1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:0>", "<sample:0>", "<i:1>", "1.1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "1E-5"}}), new String[][]{{"findValues", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.String"}, new String[]{"<sample:3>", "-1.5"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false), new String[][]{{"bigIntegerValue", "", "3"}, {"isBigDecimal", "", "0"}, {"findParents", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:7>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", "com.fasterxml.jackson.core.JsonParser,java.lang.String", "<sample:6>", "0xFFFFFFFF"}}), new String[][]{{"elements", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>"}, false, 0, null, 3), new String[][]{{"get", "int", "7"}, {"isIntegralNumber", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
