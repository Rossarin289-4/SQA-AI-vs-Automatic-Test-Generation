package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<b:true>"}}), new String[][]{{"enableDefaultTyping", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<b:true>"}}), new String[][]{{"enableDefaultTyping", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<d:3.0>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "setTimeZone", "java.util.TimeZone", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:>>>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:4>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<null>", "<sample:0>"}}), new String[][]{{"with", "java.text.DateFormat", "2"}, {"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"with", "java.text.DateFormat", "2"}, {"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerWithView", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<null>", "<i:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:3>"}}), new String[][]{{"readTree", "com.fasterxml.jackson.core.JsonParser", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"deepCopy", "", "1"}, {"hasNonNull", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:key>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.InjectableValues", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "java.text.DateFormat", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "createArrayNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "createArrayNode", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:ley>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.OutputStream,java.lang.Object", "<sample:2>", "<s:B'5xxc>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "com.fasterxml.jackson.databind.Module[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:5>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping"}, new String[]{"<sample:2>"}, false), new String[][]{{"clearProblemHandlers", "", "1"}, {"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "2"}, {"enable", "com.fasterxml.jackson.databind.MapperFeature[]", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_readMapAndClose", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setConfig", new String[]{"com.fasterxml.jackson.databind.SerializationConfig"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,com.fasterxml.jackson.annotation.JsonTypeInfo$As", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findModules", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonFactory$Feature", "<sample:5>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setConfig", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}}), new String[][]{{"addMixIn", "java.lang.Class,java.lang.Class", "7"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "2"}, {"addHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.MapperFeature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.OutputStream,java.lang.Object", "<sample:0>", "<s:XX>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:7>", "true"}}, 3), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "2"}, {"readTree", "java.io.InputStream", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#688669288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setFilters", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.JsonNode", "<sample:2>", "<sample:6>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModule", new String[]{"com.fasterxml.jackson.databind.Module"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<sample:7>", "type murt be provided"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_checkInvalidCopy", "java.lang.Class", "<sample:0>"}}, 1), new String[][]{{"canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "6"}, {"enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,com.fasterxml.jackson.annotation.JsonTypeInfo$As", "4"}, {"disableDefaultTyping", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", "com.fasterxml.jackson.databind.jsontype.NamedType[]", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_defaultPrettyPrinter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<sample:3>", "\t"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSerializationInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:2>"}}, 2), new String[][]{{"getFactory", "", "3"}, {"_getBufferRecycler", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.BufferRecycler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:3>", "<d:1.5>", "<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.JsonNode", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.MapperFeature[]", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:1>", "<d:1.5>", "<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.JsonNode", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "java.lang.Class"}, new String[]{"<null>", "<d:1.85>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospectors", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>", "<sample:4>"}}), new String[][]{{"getVisibilityChecker", "", "6"}, {"isCreatorVisible", "java.lang.reflect.Member", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.OutputStream", "java.lang.Object"}, new String[]{"<sample:2>", "<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:>>>", "<sample:6>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:13>", "<sample:9>", "<sample:3>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:1073610783>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.MapperFeature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:8>", "<empty>"}}), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "7"}, {"disable", "com.fasterxml.jackson.databind.DeserializationFeature", "1"}, {"createObjectNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:3>"}}), new String[][]{{"addMixInAnnotations", "java.lang.Class,java.lang.Class", "2"}, {"addHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "5"}, {"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:74>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<i:-55>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:13>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("-55 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#310#541804266", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:55>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:11>"}}), new String[][]{{"readTree", "java.io.InputStream", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#688669288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.File", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setDefaultTyping", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:7>"}}, 1), new String[][]{{"readTree", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.File", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:LYa>"}}, 2), new String[][]{{"enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "0"}, {"findAndRegisterModules", "", "7"}, {"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"findMixInClassFor", "java.lang.Class", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:2>"}}), new String[][]{{"getSerializerFactory", "", "7"}, {"getFactoryConfig", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=false, hasSerializerModifiers=false, hasSerializers=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "com.fasterxml.jackson.databind.Module[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:7>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:5>", "<empty>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "7"}, {"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disableDefaultTyping", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_convert", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:C>", "<sample:1>"}}, 1), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "7"}, {"readTree", "java.io.Reader", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<null>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", "java.lang.Object", "<s:>J>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<sample:2>", "OON_CONCRETF_AD_@RRA"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,java.lang.Class", "<d:-3.0>", "<sample:2>"}}, 1), new String[][]{{"canConvertToLong", "", "0"}, {"get", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerFactory", new String[]{"com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>"}}), new String[][]{{"findMixInClassFor", "java.lang.Class", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<null>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.MapperFeature[]", "<empty>"}}, 1), new String[][]{{"disable", "com.fasterxml.jackson.databind.SerializationFeature", "7"}, {"findMixInClassFor", "java.lang.Class", "2"}, {"mixInCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:1>"}}, 3), new String[][]{{"treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,com.fasterxml.jackson.databind.JavaType", "NON_CONCRETE_AND_ARRAYS", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<empty>", "<sample:7>"}}), new String[][]{{"disable", "com.fasterxml.jackson.databind.SerializationFeature", "0"}, {"disable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "3"}, {"readTree", "java.io.Reader", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#688669288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<sample:0>", "<empty>"}}, 3), new String[][]{{"getAttributes", "", "6"}, {"withSharedAttributes", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:2>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setLocale", "java.util.Locale", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "<sample:4>"}}), new String[][]{{"writeValue", "java.io.OutputStream,java.lang.Object", "0"}, {"getFactory", "", "7"}, {"hasFormat", "com.fasterxml.jackson.core.format.InputAccessor", "3"}, {"setCodec", "com.fasterxml.jackson.core.ObjectCodec", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModules", new String[]{"com.fasterxml.jackson.databind.Module[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<sample:1>", "<i:14>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:4>", "<sample:1>"}}, 2), new String[][]{{"constructType", "java.lang.reflect.Type", "2"}, {"isCollectionLikeType", "", "4"}, {"getKeyType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "boolean"}, new String[]{"<sample:1>", "false"}, false), new String[][]{{"generateJsonSchema", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsonschema.JsonSchema", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{\"value\":{\"type\":\"string\"},\"values\":{\"type\":\"array\",\"items\":{\"type\":\"string\"}},\"array\":{\"type\":\"array\",\"items\":{\"type\":\"any\"}}}}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<i:49>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.File,java.lang.Object", "<sample:0>", "<s:kez>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,com.fasterxml.jackson.databind.JavaType", "1.34567", "<sample:10>"}}), new String[][]{{"longValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.lang.String"}, new String[]{""}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,java.lang.Class", "null", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.lang.String"}, new String[]{"2.3\r;\r961/122345678/01.1234567"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.FormatSchema", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.File,java.lang.Object", "<sample:0>", "<s:3X>"}}, 2), new String[][]{{"isContainerNode", "", "7"}, {"asBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:1073741823>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 48, 55, 51, 55, 52, 49, 56, 50, 51]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[34, 97, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[34, 97, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[34, 97, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[34, 97, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[34, 97, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-55>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 53, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[34, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "int", "int", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>", "2147483647", "0", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:;;>", "<sample:7>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:=;>", "<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:>>>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.Reader,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "com.fasterxml.jackson.databind.Module[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.net.URL,com.fasterxml.jackson.core.type.TypeReference", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:6>", "<i:-66482>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:0>", "<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:6>", "<i:-66482>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_defaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<null>", "<sample:3>"}}, 2), new String[][]{{"indentObjectsWith", "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<null>", "<sample:0>"}}, 2), new String[][]{{"with", "java.text.DateFormat", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<null>", "<sample:0>"}}, 1), new String[][]{{"with", "java.text.DateFormat", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setLocale", "java.util.Locale", "<empty>"}}, 2), new String[][]{{"with", "java.text.DateFormat", "2"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonFactory$Feature", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonFactory$Feature", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:3>"}}, 2), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:3>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:2>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:2>", "0", "10", "<sample:5>"}}, 3), new String[][]{{"getSerializerFactory", "", "6"}, {"withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "2"}, {"createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "4"}, {"serialize", "java.util.List,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:2>", "0", "10", "<sample:5>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "4"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:2>", "0", "10", "<sample:4>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "4"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "0", "10", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "4"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:3>", "-2147483648", "10", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 3), new String[][]{{"getDeserializationConfig", "", "3"}, {"getRootName", "", "2"}, {"mixInCount", "", "4"}, {"getLocale", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 46, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:8>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 47, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:8>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"asLong", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 49, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:10>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 3), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"deepCopy", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}, 2), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"deepCopy", "", "1"}, {"hasNonNull", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 2), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"deepCopy", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}}, 1), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}}, 1), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "2"}, {"canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:2>", "1", "0", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:1>"}}, 1), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:2>", "1", "0", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:1>"}}, 1), new String[][]{{"enable", "com.fasterxml.jackson.databind.DeserializationFeature", "1"}, {"disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "0"}, {"canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "6"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:0>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", "java.lang.Object", "<i:-66482>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<empty>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", "java.lang.Object", "<i:-66482>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:8>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", "java.lang.Object", "<i:-66482>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<null>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-14>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", "java.lang.Object", "<i:-268501938>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<null>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-14>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<null>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-72>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<null>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-72", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-58>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-58", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<b:true>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:;>>", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:0>", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:4>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"java.text.DateFormat"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:0>"}}, 2), new String[][]{{"withoutFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:a>", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "addHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_readValue", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:5>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:C>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "addHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,com.fasterxml.jackson.databind.JavaType", "true", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:Y>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,com.fasterxml.jackson.databind.JavaType", "true", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.net.URL,com.fasterxml.jackson.core.type.TypeReference", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:X>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<i:8>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2147483638>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:29>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:ke4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "byte[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,java.lang.Class", ".5", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:aG>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<i:-98>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_convert", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<i:-66482>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-66482>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 54, 54, 52, 56, 50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.File", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[52]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:30>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[51, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:55>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[53, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-55>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 53, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-110>"}, false);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49, 49, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-55>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "java.lang.Iterable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 53, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-91>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "java.lang.Iterable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 57, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:17>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "java.lang.Iterable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 55]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "java.lang.Iterable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[56]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[52]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.Writer", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-55>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-66482>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<null>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<null>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 54, 54, 52, 56, 50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-66482>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 54, 54, 52, 56, 50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<d:3.0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<d:3.0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.Reader,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<d:3.0>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<d:3.0>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setTimeZone", "java.util.TimeZone", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "byte[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<d:3.0>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "setTimeZone", "java.util.TimeZone", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.File", "java.lang.Object"}, new String[]{"<sample:3>", "<b:true>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", "java.lang.Object", "<i:-55>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.Reader,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<i:-16>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:1>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.net.URL,com.fasterxml.jackson.core.type.TypeReference", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<d:1.5>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:4>", "<i:-66482>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<d:1.5>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:4>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getTypeFactory", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:1>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:4>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:1>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:4>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:1>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:6>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:2>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:6>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-2>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:6>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:6>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-1>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,java.lang.Class", "<sample:6>", "<i:-66482>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_defaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_defaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:1>", "<sample:3>"}}), new String[][]{{"indentObjectsWith", "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_defaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:4>"}}), new String[][]{{"indentObjectsWith", "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_defaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "generateJsonSchema", "java.lang.Class", "<sample:2>"}}), new String[][]{{"indentObjectsWith", "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "byte[]", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "byte[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<null>", "<sample:0>"}}), new String[][]{{"with", "java.text.DateFormat", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:1>", "<sample:2>"}}), new String[][]{{"readTree", "java.io.File", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerWithView", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"java.text.DateFormat"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:4>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.File,java.lang.Object", "<null>", "<i:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonFactory$Feature", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<null>", "<s:>>>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSerializationInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<null>"}}), new String[][]{{"canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<null>"}}), new String[][]{{"getDeserializationConfig", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=459920, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:3>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:6>"}}), new String[][]{{"addMixInAnnotations", "java.lang.Class,java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!RuntimeException, hasNextValue=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:5>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<null>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:5>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<empty>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_serializerProvider", "com.fasterxml.jackson.databind.SerializationConfig", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.Writer", "java.lang.Object"}, new String[]{"<null>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:3>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:2>", "0", "10", "<sample:5>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "4"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:2>", "0", "10", "<sample:5>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "4"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:2>", "0", "10", "<sample:4>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "4"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setLocale", "java.util.Locale", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "4"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 45, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:9>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"findValuesAsText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializationInclusion", new String[]{"com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"deepCopy", "", "1"}, {"hasNonNull", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationConfig", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=459920, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationConfig", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}), new String[][]{{"getDeserializationConfig", "", "3"}, {"getRootName", "", "2"}, {"getTypeFactory", "", "1"}, {"constructRawCollectionLikeType", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Integer, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljava/lang/Object;>;, ge...#536#129165813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "createArrayNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"createObjectNode", "", "2"}, {"deepCopy", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "3"}, {"disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "4"}, {"canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:2>", "1", "-1", "<null>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "4"}, {"canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "6"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:2>", "1", "0", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.MapperFeature[]", "<empty>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:4>", "<sample:6>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getTypeFactory", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:4>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSerializationInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:4>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:17>", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "int", "int", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "2", "1", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:17>", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:>>\r>", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "constructType", "java.lang.reflect.Type", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">>\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getVisibilityChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:49>", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "version", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_checkInvalidCopy", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setDateFormat", "java.text.DateFormat", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createArrayNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.File", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,com.fasterxml.jackson.databind.JavaType", "true", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:XX>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<empty>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:6>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_serializerProvider", new String[]{"com.fasterxml.jackson.databind.SerializationConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.JsonNode", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:0>", "-2147483648", "-1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "byte[]", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "version", ""}}), new String[][]{{"parseDate", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,com.fasterxml.jackson.databind.JavaType", "true", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:-110>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "int", "int", "java.lang.Class"}, new String[]{"<sample:1>", "-1", "-2147483648", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<sample:5>", "a,b,c"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,com.fasterxml.jackson.core.type.TypeReference", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "java.lang.String"}, new String[]{"<sample:0>", "i"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "mixInCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"0x123456789", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.OutputStream", "java.lang.Object"}, new String[]{"<empty>", "<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.InputStream", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModules", new String[]{"com.fasterxml.jackson.databind.Module[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.OutputStream,java.lang.Object", "<empty>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "int", "int", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "0", "1", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createArrayNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}), new String[][]{{"elements", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.File", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "addMixInAnnotations", "java.lang.Class,java.lang.Class", "<empty>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonFactory$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", new String[]{}, new String[]{}, false), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "5"}, {"createParser", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModules", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.MapperFeature", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,com.fasterxml.jackson.core.type.TypeReference", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:XX>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.MapperFeature[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:5>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.io.CharacterEscapes", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", "com.fasterxml.jackson.databind.jsontype.SubtypeResolver", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:3>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:6>"}, false), new String[][]{{"getNodeFactory", "", "5"}, {"numberNode", "java.math.BigDecimal", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DecimalNode", actual.getClass().getName());
  assertEquals("0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=true, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#308#-1852630315", SearchInputFactory_scaffolding.observe(actual));
 }
}
