package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:9>", "<sample:11>", "<s:b>", "ab1c"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:6>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:1>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:6>", "<i:-1>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<sample:8>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<null>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", "java.lang.String", "a b"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "htp://example.com/`?b=c"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"HHello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", "java.lang.String", "/a//b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:8>", "<sample:7>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"1.3"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:1>", "<sample:7>", "<i:0>", "a "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<null>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"hasNonNull", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", "java.lang.String", " b"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"12:0:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:3>", "<sample:8>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"u\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "`bc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:1>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:10>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:4>", "<sample:6>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "<sample:7>", "Heln, World"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:6>", "<sample:4>", "<sample:6>", "0xFFFFFFFF", "<sample:0>", "<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0x12h34"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"isBigDecimal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"nul_"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>", "+1f", "<null>", "<sample:6>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:11>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", "com.fasterxml.jackson.core.JsonParser,java.lang.String", "<sample:6>", "/a/b"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"n9ull"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"1PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:4>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getEmptyValue", "", "4"}, {"asDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<sample:0>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<null>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"getValueType", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:2>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:7>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:9>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:7>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>", "1e1\n", "<null>", "<sample:3>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"handledType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1), new String[][]{{"getDelegatee", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", "java.lang.String", ".W5"}}, 1), new String[][]{{"isInt", "", "6"}, {"findParents", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<sample:8>", "<sample:5>"}, false, 0, null, 3), new String[][]{{"isValueNode", "", "1"}, {"isValueNode", "", "2"}, {"isBigInteger", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567a"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "0"}, {"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:2>", "<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"ab"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", "java.lang.String", "0010"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:7>", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"`"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"findParents", "java.lang.String,java.util.List", "7"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "[1,2]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "<sample:6>", "null"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:8>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:2>", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:10>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:8>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:2>", "<sample:10>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isShort", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false), new String[][]{{"isValueNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:0>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}), new String[][]{{"isIntegralNumber", "", "5"}, {"get", "java.lang.String", "7"}, {"asInt", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.String"}, new String[]{"<sample:5>", "01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>", "<sample:7>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isIntegralNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:10>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:0>", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:4>", "<sample:7>", "<sample:3>", "1xFFFFFFFF", "<sample:3>", "<sample:2>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:9>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory,java.lang.String,com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode,com.fasterxml.jackson.databind.JsonNode", "<sample:6>", "<sample:7>", "<sample:3>", "aa", "<sample:5>", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "PT1H"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:10>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:7>", "<sample:2>"}}), new String[][]{{"findValuesAsText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<null>"}}), new String[][]{{"floatValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", "com.fasterxml.jackson.core.JsonParser,java.lang.String", "<sample:1>", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:11>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "12:30:452147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}}), new String[][]{{"isFloatingPointNumber", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "0x1F"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:3>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:10>", "<s:ke]>", "l+11"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:1>", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false), new String[][]{{"isArray", "", "4"}, {"isIntegralNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>"}, false, 3, new String[][]{}), new String[][]{{"bigIntegerValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>", "<sample:5>", "<sample:5>"}}), new String[][]{{"fieldNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:2>", "<sample:7>", "<sample:8>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:1>", "<sample:2>"}, false), new String[][]{{"isBinary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false), new String[][]{{"findValues", "java.lang.String,java.util.List", "7"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false), new String[][]{{"findParents", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", "java.lang.String", "2147483648 "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}}), new String[][]{{"get", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"getKnownPropertyNames", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"f1e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false), new String[][]{{"findPath", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"get", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<null>", "<b:false>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:0>", "<sample:6>", "<sample:5>"}}), new String[][]{{"handledType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isCachable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"getEmptyValue", "", "6"}, {"isLong", "", "6"}, {"getNodeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:4>", "<sample:4>", "<sample:4>"}}), new String[][]{{"asInt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}), new String[][]{{"findParent", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getObjectIdReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", "java.lang.String", ""}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "6"}, {"fieldNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}}), new String[][]{{"asDouble", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5e30"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"getEmptyValue", "", "3"}, {"findValues", "java.lang.String,java.util.List", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:8>", "<null>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<null>", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<s:b>", "htt?://example.com/a?b=c"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false), new String[][]{{"findPath", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"getDelegatee", "", "3"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "3"}, {"getNullValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:10>"}, false, 2, new String[][]{}), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "java.lang.String", "com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:1>", "<null>", "<sample:3>", "/au/b2147483648", "<sample:4>", "<sample:5>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:10>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"9\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", "java.lang.String", ".4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}}), new String[][]{{"elements", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:8>"}}), new String[][]{{"findValues", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}}), new String[][]{{"getValueType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<null>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<sample:3>", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<sample:6>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:9>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:7>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"1. "}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"---71"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>", "<sample:1>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"getValueClass", "", "2"}, {"findBackReference", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:4>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"findPath", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}), new String[][]{{"isTextual", "", "2"}, {"getNodeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:7>", "<sample:9>"}, false, 2, new String[][]{}), new String[][]{{"asLong", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<sample:9>", "00x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:6>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:10>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"getNullValue", "", "4"}, {"asLong", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"getNullValue", "", "4"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "6"}, {"isTextual", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"fieldNames", "", "0"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNegInf", "java.lang.String", "1.1234567."}}), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "1"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory,java.lang.String,com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode,com.fasterxml.jackson.databind.JsonNode", "<sample:2>", "<sample:3>", "<sample:1>", "8", "<sample:4>", "<sample:1>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{".4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory,java.lang.String,com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode,com.fasterxml.jackson.databind.JsonNode", "<sample:2>", "<null>", "<sample:5>", "", "<null>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "<sample:2>", "0a/bP"}}, 3), new String[][]{{"decimalValue", "", "2"}, {"fields", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>", "<sample:9>", "<sample:7>"}, false, 3, new String[][]{}, 1), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isNaN", "java.lang.String", "a/a"}}, 1), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getKnownPropertyNames", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "<sample:4>", "1.1234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "TH"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "0x1F"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "\u00e9"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:5>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getKnownPropertyNames", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"findBackReference", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:3>", "<sample:6>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<null>", "<sample:2>"}, false), new String[][]{{"isArray", "", "6"}, {"findValues", "java.lang.String,java.util.List", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"getNullValue", "", "6"}, {"decimalValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"asDouble", "", "1"}, {"asDouble", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"getDelegatee", "", "7"}, {"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"findBackReference", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"Titld"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}}, 2), new String[][]{{"isPojo", "", "1"}, {"isFloat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_reportProblem", "com.fasterxml.jackson.core.JsonParser,java.lang.String", "<sample:7>", "-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "PE-F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>"}, false), new String[][]{{"decimalValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:5>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false), new String[][]{{"findParents", "java.lang.String,java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:3>", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>", "<sample:0>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}}, 2), new String[][]{{"handledType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:9>", "<sample:4>", "<sample:1>", "ntll"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getEmptyValue", ""}}, 1), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "3"}, {"findParents", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findBackReference", "java.lang.String", "srue"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isPosInf", "java.lang.String", "1.1234567890123456"}}, 1), new String[][]{{"findBackReference", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>"}, false), new String[][]{{"isContainerNode", "", "0"}, {"findValuesAsText", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_hasTextualNull", "java.lang.String", "2{\"a\":1}"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_handleDuplicateField", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory,java.lang.String,com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode,com.fasterxml.jackson.databind.JsonNode", "<sample:2>", "<sample:4>", "<sample:1>", "null", "<sample:3>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>", "<sample:6>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:4>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getValueType", ""}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"get", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"fields", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"+"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:9>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "handledType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>", "<sample:5>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserializeArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 1), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "1"}, {"has", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<null>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "getDeserializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3), new String[][]{{"getDelegatee", "", "3"}, {"getValueClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class com.fasterxml.jackson.databind.JsonNode {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=com.fasterxml.jackson.databind.JsonNode, getClasses=[], getConstructors=[], getDeclaredAnno...#590#1646028277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}}, 1), new String[][]{{"fieldNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", "_fromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:2>", "<sample:3>", "<sample:7>"}, false, 4, new String[][]{}, 3), new String[][]{{"findParents", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
}
