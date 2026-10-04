package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setConfig", "com.fasterxml.jackson.databind.SerializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createArrayNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:4>", "<sample:4>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.lang.String"}, new String[]{"-11.25"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("-11.25 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=true, i...#313#1395184243", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,java.lang.Class", "2147483638", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_readMapAndClose", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findModules", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.Reader", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:9>"}}, 1), new String[][]{{"addMixInAnnotations", "java.lang.Class,java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_checkInvalidCopy", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:1>", "false"}}), new String[][]{{"addMixInAnnotations", "java.lang.Class,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:6>", "<d:-1.556>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "com.fasterxml.jackson.annotation.JsonTypeInfo$As"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.DataOutput", "java.lang.Object"}, new String[]{"<sample:1>", "<b:false>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:3>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setFilters", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.DeserializationFeature,boolean", "<sample:8>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", new String[]{"java.lang.Object"}, new String[]{"<i:-39>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "java.lang.Iterable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-39", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:2>"}}), new String[][]{{"withFeatures", "com.fasterxml.jackson.databind.SerializationFeature[]", "7"}, {"withSchema", "com.fasterxml.jackson.core.FormatSchema", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", new String[]{"com.fasterxml.jackson.databind.jsontype.NamedType[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setFilters", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "buildTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:7>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "inclusion", "com.fasterxml.jackson.annotation.JsonTypeInfo$As", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disableDefaultTyping", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.JsonNode", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType", "<sample:11>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:9>"}}), new String[][]{{"getSerializerProviderInstance", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.MapperFeature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "java.lang.Class", "<sample:1>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.core.type.TypeReference", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:0>"}}, 2), new String[][]{{"getFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:2>", "38", "2147483583", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerProvider", new String[]{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.OutputStream,java.lang.Object", "<sample:4>", "<b:false>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getVisibilityChecker", ""}}), new String[][]{{"configOverride", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.MutableConfigOverride", actual.getClass().getName());
  assertEquals("{getIsIgnoredType=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.File,java.lang.Object", "<sample:4>", "<d:0.75>"}}), new String[][]{{"createArrayNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.Reader,java.lang.Class", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("0.75 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=true, isF...#311#1924235995", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerFor", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.Writer", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-1073741821>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getInjectableValues", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospectors", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:10>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:N>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("4 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#308#-1903850781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:2>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<null>", "0xFFFFFFFSF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModules", new String[]{"com.fasterxml.jackson.databind.Module[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:7>", "<i:29>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readerFor", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}}, 1), new String[][]{{"convertValue", "java.lang.Object,java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:0>", "<sample:10>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setDefaultPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.DeserializationFeature,boolean", "<sample:7>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:9>", "<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.InjectableValues", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readerFor", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:2>", "<sample:6>"}}, 3), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "buildTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:0>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "idResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean", "<sample:5>", "<sample:16>", "<sample:2>", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", "java.lang.Object", "<s:N>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", "java.lang.Class", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"null", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.core.FormatSchema", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}, 3), new String[][]{{"getPropertyNamingStrategy", "", "5"}, {"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#688669288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerFactory", new String[]{"com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}), new String[][]{{"createArrayNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:9>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,com.fasterxml.jackson.core.type.TypeReference", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"hasHandlers", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,java.lang.Class", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setTypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "<sample:0>"}}, 1), new String[][]{{"getSubtypeResolver", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>", "<empty>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "mixInCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setTimeZone", "java.util.TimeZone", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.File,java.lang.Object", "<sample:4>", "<i:-18>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,java.lang.Class", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerFactory", new String[]{"com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}), new String[][]{{"disable", "com.fasterxml.jackson.databind.MapperFeature[]", "7"}, {"getSerializerFactory", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:1>"}}), new String[][]{{"with", "com.fasterxml.jackson.core.FormatSchema", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setConfig", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setMixInResolver", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "<sample:1>"}}), new String[][]{{"createObjectNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "typeProperty", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "buildTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "<sample:6>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "getDefaultImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "defaultImpl", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "typeIdVisibility", "boolean", "true"}, {"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "idResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection,boolean,boolean", "<sample:6>", "<sample:0>", "<sample:0>", "true", "false"}}), new String[][]{{"typeIdVisibility", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerWithView", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setDefaultTyping", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "generateJsonSchema", "java.lang.Class", "<sample:0>"}}, 3), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.DataInput", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:12>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setConfig", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setLocale", "java.util.Locale", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:2>", "<sample:5>"}}), new String[][]{{"findMixInClassFor", "java.lang.Class", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerFor", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,com.fasterxml.jackson.annotation.JsonTypeInfo$As", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_verifySchemaType", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:7>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}), new String[][]{{"treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<d:-0.375>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,com.fasterxml.jackson.annotation.JsonTypeInfo$As", "<sample:3>", "<sample:2>"}}, 2), new String[][]{{"booleanValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializationInclusion", new String[]{"com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setFilterProvider", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:5>"}}, 3), new String[][]{{"configOverride", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.MutableConfigOverride", actual.getClass().getName());
  assertEquals("{getIsIgnoredType=null}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_convert", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:`>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<sample:4>", "5-"}}, 2), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "noTypeInfoBuilder", new String[]{}, new String[]{}, true), new String[][]{{"typeProperty", "java.lang.String", "4"}, {"typeProperty", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=a, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:4>", "<i:-1073741824>"}}), new String[][]{{"findParent", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:10>", "<sample:4>"}}), new String[][]{{"getSerializerProvider", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:5>"}}, 1), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}, {"getVisibilityChecker", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "generateJsonSchema", "java.lang.Class", "<null>"}}), new String[][]{{"enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "6"}, {"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:6>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,com.fasterxml.jackson.annotation.JsonTypeInfo$As", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "java.lang.String"}, new String[]{"<sample:7>", "fPT1("}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.FormatSchema", "<sample:9>"}}, 2), new String[][]{{"generateJsonSchema", "java.lang.Class", "6"}, {"getSchemaNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"array\",\"items\":{\"type\":\"any\"}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1809547161", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[34, 98, 34]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"java.text.DateFormat"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "true"}}), new String[][]{{"withAttribute", "java.lang.Object,java.lang.Object", "1"}, {"withSchema", "com.fasterxml.jackson.core.FormatSchema", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerFor", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_newReader", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:1>", "<sample:11>", "<s:Pe>", "<sample:2>", "<sample:4>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setFilters", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:3>", "<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getFactory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:3>", "<sample:10>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_checkInvalidCopy", "java.lang.Class", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.core.type.TypeReference", "<sample:5>", "2147483647", "-2147483607", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDateFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "idResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.JavaType", "java.util.Collection", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>", "true", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "init", "com.fasterxml.jackson.annotation.JsonTypeInfo$Id,com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.net.URL", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"1e10", "<sample:4>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "buildTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:3>", "<null>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:12>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:1>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "false"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSerializerProviderInstance", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInResolver", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setConfig", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:3>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyInclusion", new String[]{"com.fasterxml.jackson.annotation.JsonInclude$Value"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addMixIn", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:10>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerProvider", new String[]{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSerializerProvider", ""}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "4"}, {"getDeserializationConfig", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=119589152, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<i:-8193>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSerializationConfig", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8193", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationConfig", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=119589152, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>", "<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.Writer", "java.lang.Object"}, new String[]{"<sample:1>", "<s:a>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.annotation.PropertyAccessor", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_serializerProvider", new String[]{"com.fasterxml.jackson.databind.SerializationConfig"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 4, new String[][]{}, 2), new String[][]{{"getJsonFactory", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getSerializationConfig", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setFilterProvider", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setDefaultPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"clearProblemHandlers", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>", "<sample:5>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=119589152}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addMixIn", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "clearProblemHandlers", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:3>", "<s:ky>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_serializerProvider", "com.fasterxml.jackson.databind.SerializationConfig", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:14>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "defaultClassIntrospector", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<s:>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "generateJsonSchema", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_checkInvalidCopy", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:10>", "<sample:1>"}}, 2), new String[][]{{"getSchemaNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"integer\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isD...#328#63199994", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:10>", "<sample:2>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInResolver", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2), new String[][]{{"constructType", "java.lang.reflect.Type", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#594#1567312813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "clearProblemHandlers", ""}}, 2), new String[][]{{"getDeserializationConfig", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=119589152, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 6, new String[][]{}, 2), new String[][]{{"getTypeFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:1>", "<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "clearProblemHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "typeIdVisibility", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "addMixInAnnotations", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_serializerProvider", new String[]{"com.fasterxml.jackson.databind.SerializationConfig"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"java.text.DateFormat"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setConfig", "com.fasterxml.jackson.databind.SerializationConfig", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "typeIdVisibility", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"'), but ", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_readValue", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:8>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "mixInCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setVisibilityChecker", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "isTypeIdVisible", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:2>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.MapperFeature[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.PrettyPrinter", "<sample:6>", "<sample:11>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.MapperFeature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findModules", new String[]{"java.lang.ClassLoader"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addMixInAnnotations", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerFor", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixIns", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.8.4-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=8, getPatchLevel=4, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#524935934", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createObjectNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "version", new String[]{}, new String[]{}, false), new String[][]{{"getGroupId", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_readValue", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:6>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:6>"}, false), new String[][]{{"canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:7>", "<s:cm>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "int", "int", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>", "2147483647", "-2", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.core.type.TypeReference", "<d:1.556>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerWithView", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerWithView", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"I{\"a\":1}", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "mixInCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSerializerProvider", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.lang.String"}, new String[]{"1..12345678901234567true"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.core.type.TypeReference", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"{\"a\"1}", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.InputStream,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],java.lang.Class", "<empty>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setFilters", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!RuntimeException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setDefaultTyping", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_newReader", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addMixIn", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInResolver", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"java.text.DateFormat"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}), new String[][]{{"with", "com.fasterxml.jackson.databind.ser.FilterProvider", "3"}, {"getTypeFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", "java.lang.Class", "<sample:0>"}}), new String[][]{{"disable", "com.fasterxml.jackson.databind.SerializationFeature", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-1073741824>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "addMixInAnnotations", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findModules", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:Pe>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false), new String[][]{{"readValue", "byte[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"1.5f", "<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSerializerProvider", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "copy", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSubtypeResolver", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.File", "java.lang.Object"}, new String[]{"<null>", "<s:b>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getNodeFactory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getSubtypeResolver", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "typeProperty", new String[]{"java.lang.String"}, new String[]{"nullNON_CONCRETE_AND_ARRAYS"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=nullNON_CONCRETE_AND_ARRAYS, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getTypeProperty=nullNON_CONCRETE_AND_ARRAYS, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}), new String[][]{{"canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", "idResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.JavaType", "java.util.Collection", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "<sample:5>", "true", "false"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<null>", "<sample:11>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("-2147483648 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fa...#318#-1410540227", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "defaultClassIntrospector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.Writer", "java.lang.Object"}, new String[]{"<empty>", "<b:true>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:2>", "<i:-2147483648>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configOverride", "java.lang.Class", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.MapperFeature", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "getSerializationConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "2147483620", "2147483647", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:6>"}}), new String[][]{{"getSerializationConfig", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:8>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<null>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disableDefaultTyping", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.PrettyPrinter", "<sample:5>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.core.FormatSchema", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getSerializerProviderInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,java.lang.Class", "<i:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:8>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModules", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "com.fasterxml.jackson.annotation.JsonTypeInfo$As"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", "java.lang.Class[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_readMapAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 4, new String[][]{}), new String[][]{{"getDeserializationConfig", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=119589152, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:13>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerFor", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("0.75 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=true, isF...#311#1924235995", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.Reader", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerProvider", new String[]{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configOverride", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.OutputStream", "java.lang.Object"}, new String[]{"<sample:2>", "<i:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:8>", "<d:0.75>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", new String[]{"com.fasterxml.jackson.databind.cfg.HandlerInstantiator"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", new String[]{"com.fasterxml.jackson.databind.SerializationConfig"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "boolean"}, new String[]{"<null>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "2147483647", "1073741823", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.File", "java.lang.Object"}, new String[]{"<sample:4>", "<i:-1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "2147483647", "1", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
