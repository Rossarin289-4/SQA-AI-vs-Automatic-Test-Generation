package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:5>", "<sample:1>"}}), new String[][]{{"getJsonFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:4>", "<null>", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), START_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHigh...#255#1143940540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), START_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHigh...#255#1143940540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"\n", "1E+100"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\n), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#741391264", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", "java.lang.Class", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "defaultClassIntrospector", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"byte[]", "int", "int", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "10", "16", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,java.lang.Class", "<s:b>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, g...#236#-934140075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:5>", "<i:0>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", "com.fasterxml.jackson.databind.jsontype.NamedType[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", " ", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, FIELD_NAME( ), VALUE_FALSE, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ...#262#-1548221794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "mixInCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "10", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#1507277943", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithView", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "java.lang.Class", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:'cyDb>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}, 1), new String[][]{{"acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-258246973", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-258246973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "[typeId=", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([typeId=), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-1660259686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerForUpdating", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"java.text.DateFormat"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findModules", new String[]{"java.lang.ClassLoader"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.OutputStream", "java.lang.Object"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disableDefaultTyping", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"1.1234567890123456", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setDefaultPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", new String[]{"com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "java.lang.String"}, new String[]{"<sample:7>", "Title"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.InjectableValues", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "clearProblemHandlers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}}), new String[][]{{"hasPrefetchedSerializer", "", "6"}, {"getConfig", "", "4"}, {"constructType", "java.lang.Class", "6"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List<Ljava/lang/Object;>;, getTypeName=[col...#522#-835137688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerProvider", new String[]{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<i:-1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValue", "java.io.Writer,java.lang.Object", "<sample:3>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "generateJsonSchema", "java.lang.Class", "<sample:0>"}}), new String[][]{{"disable", "com.fasterxml.jackson.core.JsonParser.Feature[]", "5"}, {"addMixInAnnotations", "java.lang.Class,java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.File", "java.lang.Object"}, new String[]{"<null>", "<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:3>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.File", "java.lang.Object"}, new String[]{"<sample:0>", "<s:b>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:2>", "1", "2", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:0>", "<i:-27>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.File", "java.lang.Object"}, new String[]{"<sample:0>", "<s:b>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:2>", "1", "2", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:0>", "<i:-27>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.Writer", "java.lang.Object"}, new String[]{"<null>", "<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_initForReading", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<null>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"short"}, new String[]{"-16384"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutput...#228#546741556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixIns", "java.util.Map", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readerWithView", "java.lang.Class", "<null>"}}, 1), new String[][]{{"enable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "4"}, {"canDeserialize", "com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "` b"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#241#1577165649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getFormatFeatures", ""}}), new String[][]{{"getTextLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#208581228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:'cyDb>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-63>", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setHandlerInstantiator", "com.fasterxml.jackson.databind.cfg.HandlerInstantiator", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-63", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setDateFormat", new String[]{"java.text.DateFormat"}, new String[]{"<sample:4>"}, false), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "6"}, {"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInResolver", new String[]{"com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getTypeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<b:false>", "<empty>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_checkInvalidCopy", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<i:-35>", "<empty>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<b:true>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:ske>", "<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerFor", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<b:true>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ske", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSerializerFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:m'CcyDb>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,java.lang.Class", "16", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:3>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibilityChecker", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.core.FormatSchema", "<sample:1>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerFor", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_defaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.InjectableValues", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"TITLE", "10", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setDefaultTyping", "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "disableDefaultTyping", ""}}), new String[][]{{"configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "7"}, {"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "4"}, {"configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.DeserializationFeature,boolean", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerModules", "java.lang.Iterable", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.net.URL,com.fasterxml.jackson.core.type.TypeReference", "<sample:4>", "<sample:1>"}}), new String[][]{{"enable", "com.fasterxml.jackson.databind.MapperFeature[]", "3"}, {"getDateFormat", "", "6"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US) {isLenient=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getSerializationConfig", ""}}), new String[][]{{"canDeserialize", "com.fasterxml.jackson.databind.JavaType", "3"}, {"findAndRegisterModules", "", "6"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "3"}, {"copy", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false), new String[][]{{"hasTextCharacters", "", "0"}, {"getNumberType", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModule", new String[]{"com.fasterxml.jackson.databind.Module"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 2), new String[][]{{"enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,com.fasterxml.jackson.annotation.JsonTypeInfo$As", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "17"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#130262905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "\u00e8", "0.5"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\u00e8), VALUE_NUMBER_FLOAT, START_ARRAY, FIELD_NAME(GeneratedTestInputProxy), END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=...#309#-1761417639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:1>", "<i:-2147483648>", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x1", "<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "1", "-536870949"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#821649862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", "java.lang.Object", "<i:49>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("1.1234567890123457 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDo...#325#-1318662309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<i:-38>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.LongNode", actual.getClass().getName());
  assertEquals("-38 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#310#1896981719", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<s:kx>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,java.lang.Class", "<i:-16>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsString", "java.lang.Object", "<i:16>"}}, 1), new String[][]{{"isNull", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<sample:3>", " "}, {"com.fasterxml.jackson.databind.ObjectMapper", "setSerializationInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:7>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],com.fasterxml.jackson.core.type.TypeReference", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", "java.lang.Class[]", "<empty>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonFactory$Feature", "6"}, {"getNodeFactory", "", "1"}, {"binaryNode", "byte[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"BAUG\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#1048989921", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTypingAsProperty", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping,java.lang.String", "<sample:3>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}), new String[][]{{"canSerialize", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setLocale", new String[]{"java.util.Locale"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.JsonNode", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setFilters", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:4>"}}), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "3"}, {"acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "3"}, {"generateJsonSchema", "java.lang.Class", "2"}, {"getSchemaNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{\"value\":null,\"values\":{\"type\":\"array\",\"items\":{\"type\":\"any\"}},\"array\":{\"type\":\"array\",\"items\":{\"type\":\"any\"}}}} {canConvertToInt=false, canConvertToLong=false, getNodeTy...#452#-1772482289", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:6>", "<s:i:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:10>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.File", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:U>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setConfig", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<i:30>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.File", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<d:17.95>", "<sample:12>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "disable", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<b:true>", "<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],java.lang.Class", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:m1'0CRxD(>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:V>", "<sample:12>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "setInjectableValues", "com.fasterxml.jackson.databind.InjectableValues", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("V", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<empty>", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_convert", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:'cyDb>", "<sample:12>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.lang.String,com.fasterxml.jackson.databind.JavaType", "{\"a\":1}", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:5>", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-2147483648", "<s:'cyDa>"}}, 2), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#483270052", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=63, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1884336216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}, 2), new String[][]{{"nextFieldName", "", "0"}, {"getCurrentValue", "", "3"}, {"getValueAsBoolean", "boolean", "1"}, {"nextLongValue", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2023557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 3), new String[][]{{"nextFieldName", "", "5"}, {"getBigIntegerValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-7.1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}), new String[][]{{"nextFieldName", "", "3"}, {"getBigIntegerValue", "", "3"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=-7, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=-7, getCurrentName=null, getCurrentToken=VALUE_N...#407#-742358611", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-1711708972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 2), new String[][]{{"getEmbeddedObject", "", "3"}, {"getBigIntegerValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 2), new String[][]{{"nextFieldName", "", "3"}, {"getBigIntegerValue", "", "3"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "3"}, {"getTextOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-800096627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "15.981"}}), new String[][]{{"nextFieldName", "", "7"}, {"getBigIntegerValue", "", "3"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}, {"getTextLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, START_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures...#266#-49774347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}}, 3), new String[][]{{"nextFieldName", "", "4"}, {"getBigIntegerValue", "", "5"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}, {"getCodec", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#-1424623304", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "htp://example.com/a?b=c"}}), new String[][]{{"nextFieldName", "", "4"}, {"getBigIntegerValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "0.222"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "htp://example.com/a?b=c"}}), new String[][]{{"nextFieldName", "", "4"}, {"getBigIntegerValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospectors", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readerWithView", "java.lang.Class", "<sample:1>"}}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "1.7014117E38"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<s:Lk>"}}), new String[][]{{"nextFieldName", "", "4"}, {"getBigIntegerValue", "", "5"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-1, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=-1, getCurrentName=null, getCurrentToken=VALUE...#375#523441025", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatF...#273#-592258972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-1.7014117E38"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "2:30:45", "1073741824"}}, 1), new String[][]{{"nextFieldName", "", "4"}, {"getInputSource", "", "2"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "1"}, {"getObjectId", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(2:30:45), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFea...#271#-1375883105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", ""}}, 3), new String[][]{{"nextFieldName", "", "2"}, {"getCurrentName", "", "2"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "2"}, {"getTypeId", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2023557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-Infinity"}}, 1), new String[][]{{"getTextCharacters", "", "0"}, {"getFeatureMask", "", "0"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#459#1422002738", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2023557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "registerModules", new String[]{"com.fasterxml.jackson.databind.Module[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:1>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:10>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "1.3611294E38"}}, 1), new String[][]{{"nextFieldName", "", "4"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "3"}, {"getTextCharacters", "", "4"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[1, ., 3, 6, 1, 1, 2, 9, 4, E, 3, 8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2023557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:10>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "2.722259E37"}}, 3), new String[][]{{"nextFieldName", "", "5"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "6"}, {"close", "", "4"}, {"nextBooleanValue", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2023557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSubtypeResolver", new String[]{"com.fasterxml.jackson.databind.jsontype.SubtypeResolver"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "--1", "0", "1"}}), new String[][]{{"writeArrayFieldStart", "java.lang.String", "7"}, {"canWriteBinaryNatively", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(sample), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatur...#268#917932400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setMixInAnnotations", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:10>", "<sample:4>", "<sample:12>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"type must be provided", "<i:-8270>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, FIELD_NAME(type must be provided), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, g...#282#509755634", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "Zobject:d=;"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, FIELD_NAME(Zobject:d=;), START_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getForma...#275#-750094581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "com.fasterxml.jackson.core.type.TypeReference", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getInjectableValues", ""}}, 1), new String[][]{{"configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "6"}, {"constructType", "java.lang.reflect.Type", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setTypeFactory", new String[]{"com.fasterxml.jackson.databind.type.TypeFactory"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<s:m1'0CRxD(>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setSerializerFactory", new String[]{"com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:6>", "<sample:0>", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "byte[]", "<empty>"}}, 2), new String[][]{{"convertValue", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "7"}, {"enable", "com.fasterxml.jackson.databind.MapperFeature[]", "1"}, {"acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "3"}, {"getJsonFactory", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setFilterProvider", new String[]{"com.fasterxml.jackson.databind.ser.FilterProvider"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "com.fasterxml.jackson.databind.JavaType", "<sample:12>"}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:N,:B>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "I"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=N,:B]VALUE_STRING[typeId=N,:B], VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatF...#273#-1030912106", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.FormatSchema", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:4>", "<empty>"}}, 3), new String[][]{{"converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.Reader", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setConfig", new String[]{"com.fasterxml.jackson.databind.SerializationConfig"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerFor", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", "com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<i:-16777152>", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "addHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777152", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<d:-108.053>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:12>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:8>"}}, 2), new String[][]{{"asLong", "long", "7"}, {"elements", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<d:23.9551>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", "java.lang.Class", "<sample:12>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:6>", "<sample:0>"}}), new String[][]{{"asText", "", "1"}, {"deepCopy", "", "3"}, {"findValue", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"1L", "-536870949", "2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "createObjectNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#688669288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#1960799229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerFor", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationConfig", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<s::>"}}), new String[][]{{"withAttributes", "java.util.Map", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.lang.String", "java.lang.Class"}, new String[]{"-1.5", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setTimeZone", "java.util.TimeZone", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_convert", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:12>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.File", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonFactory$Feature", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 1), new String[][]{{"getFactory", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setConfig", "com.fasterxml.jackson.databind.SerializationConfig", "<sample:4>"}}, 1), new String[][]{{"getFactory", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setLocale", "java.util.Locale", "<null>"}}, 1), new String[][]{{"getFactory", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 7, new String[][]{}, 1), new String[][]{{"getFactory", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addMixIn", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:53>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "i"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), START_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, get...#259#1029932164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"'), but ", "0", "16"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", "byte[],int,int", "<sample:1>", "-2147483648", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatu...#269#1714130531", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatu...#269#1714130531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "2.5e300", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(2.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatu...#269#1543291074", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatu...#269#1543291074", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "2.5e300", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(2.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFea...#271#1421618398", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFea...#271#1421618398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "2.5e300", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "010"}}, 1), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatu...#269#1543291074", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "2.5e30", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "110"}}, 1), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2.5e30), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatur...#268#-384073192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "2.5e30", "-1"}}, 1), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2.5e30), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#1158445872", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "2.5e30", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "110"}}, 1), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2.5e30), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeat...#270#355463348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:34>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[51, 52]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-45>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 52, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-90>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 57, 48]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "canDeserialize", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234567", "34"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_INT, VALUE_STRING, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getF...#279#1117474160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffere...#221#-1384764006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, get...#234#-60811406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, g...#236#1772394382", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", " ", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, FIELD_NAME( ), VALUE_FALSE, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0...#264#-1699846214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.Reader,com.fasterxml.jackson.core.type.TypeReference", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}, 3), new String[][]{{"withType", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getDeserializationConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "disable", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:'cyD>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:1>"}}, 1), new String[][]{{"withSchema", "com.fasterxml.jackson.core.FormatSchema", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:'cyD>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:1>"}}, 1), new String[][]{{"writeValueAsString", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:'cyD>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:1>"}}, 1), new String[][]{{"writeValues", "com.fasterxml.jackson.core.JsonGenerator", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SequenceWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:'cyD>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:1>"}}, 1), new String[][]{{"acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "6"}, {"writeValuesAsArray", "java.io.Writer", "5"}, {"version", "", "2"}, {"isSnapshot", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.net.URL,java.lang.Class", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "6"}, {"writeValuesAsArray", "java.io.File", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.MapperFeature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}, 1), new String[][]{{"withRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "6"}, {"writeValuesAsArray", "java.io.Writer", "6"}, {"version", "", "2"}, {"isSnapshot", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:8>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}, 1), new String[][]{{"withRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "6"}, {"writeValuesAsArray", "java.io.Writer", "6"}, {"version", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.3-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=3, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:16>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}}, 1), new String[][]{{"with", "com.fasterxml.jackson.core.JsonFactory", "6"}, {"writeValuesAsArray", "java.io.Writer", "3"}, {"version", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.3-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=3, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TextNode", actual.getClass().getName());
  assertEquals("\"a\" {canConvertToInt=false, canConvertToLong=false, getNodeType=STRING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, i...#314#589696822", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "0"}, {"isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "6"}, {"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2147483647>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "3"}, {"isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2147483647>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "3"}, {"isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "6"}, {"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "5"}, {"writeValuesAsArray", "java.io.Writer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SequenceWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2147483647>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "3"}, {"isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "6"}, {"with", "com.fasterxml.jackson.core.io.CharacterEscapes", "5"}, {"getTypeFactory", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:2147483647>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.FormatSchema", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:22>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}}, 3), new String[][]{{"canSerialize", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}}, 3), new String[][]{{"canSerialize", "java.lang.Class", "2"}, {"with", "com.fasterxml.jackson.core.JsonFactory", "5"}, {"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.File,java.lang.Class", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "registerSubtypes", "com.fasterxml.jackson.databind.jsontype.NamedType[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:1073610730>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}}, 2), new String[][]{{"writeValueAsBytes", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:10>"}}, 3), new String[][]{{"writeValuesAsArray", "java.io.Writer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SequenceWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setPropertyNamingStrategy", new String[]{"com.fasterxml.jackson.databind.PropertyNamingStrategy"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getSerializationConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "byte[],int,int,java.lang.Class", "<sample:1>", "-1", "16", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:10>"}}, 2), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "6"}, {"getConfig", "", "5"}, {"with", "com.fasterxml.jackson.databind.PropertyNamingStrategy", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:10>"}}, 3), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "2"}, {"getConfig", "", "5"}, {"with", "com.fasterxml.jackson.databind.SerializationFeature,com.fasterxml.jackson.databind.SerializationFeature[]", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bd] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722237, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#79435362", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:-2099.88>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}}, 2), new String[][]{{"hasPrefetchedSerializer", "", "6"}, {"getConfig", "", "4"}, {"constructType", "java.lang.Class", "6"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List<Ljava/lang/Object;>;, getTypeName=[col...#522#-835137688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "registerModule", "com.fasterxml.jackson.databind.Module", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:99.29400000000001>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:8>"}}, 3), new String[][]{{"with", "com.fasterxml.jackson.databind.ser.FilterProvider", "6"}, {"getConfig", "", "4"}, {"constructType", "java.lang.Class", "3"}, {"containedTypeOrUnknown", "int", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.net.URL", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", "com.fasterxml.jackson.core.Base64Variant", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<d:99.29400000000001>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "writerWithType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:8>"}}, 3), new String[][]{{"with", "com.fasterxml.jackson.databind.ser.FilterProvider", "2"}, {"forType", "com.fasterxml.jackson.core.type.TypeReference", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", "java.lang.Class", "<null>"}}, 2), new String[][]{{"forType", "com.fasterxml.jackson.core.type.TypeReference", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writerWithDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findMixInClassFor", "java.lang.Class", "<null>"}}, 2), new String[][]{{"forType", "com.fasterxml.jackson.core.type.TypeReference", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.net.URL,java.lang.Class", "<sample:4>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.JsonNode", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.net.URL,java.lang.Class", "<sample:9>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", "int,int", "10", "16"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#459#-279921110", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=15, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#394311911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", "int,int", "10", "16"}}, 1), new String[][]{{"getDoubleValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>", "<sample:2>"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:7>", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:7>", "<s:b>"}}, 3), new String[][]{{"getInputSource", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValue", new String[]{"java.io.File", "java.lang.Object"}, new String[]{"<empty>", "<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enableDefaultTyping", "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "_configAndWriteValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:0>", "<i:-27>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.Reader", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setAnnotationIntrospector", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setNodeFactory", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:4>"}, false), new String[][]{{"getJsonFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:4>", "<null>", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "configure", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), START_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, get...#259#1029932164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "') for type "}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(') for type ), START_ARRAY, FIELD_NAME(i), START_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getF...#298#-311540368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), START_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHigh...#255#1143940540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "j"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(j), START_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHigh...#255#2045008475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "[typeId="}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([typeId=), START_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#436357648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "iPT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(iPT1H), START_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, get...#259#-827557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:53>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), START_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getH...#258#-1959060379", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatu...#269#1714130531", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatu...#269#1714130531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFea...#271#-1905387969", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFea...#271#-1905387969", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writerFor", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_readValue", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.MapperFeature,boolean", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "getSerializerProvider", ""}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", new String[]{"java.lang.Object"}, new String[]{"<i:34>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[51, 52]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerFor", "com.fasterxml.jackson.core.type.TypeReference", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "defaultClassIntrospector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readerFor", "com.fasterxml.jackson.core.type.TypeReference", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "defaultClassIntrospector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "defaultClassIntrospector", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0,...#263#-797666544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_STRING, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFor...#277#1614586627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "-2147483648", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_STRING, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getForma...#275#-1593934809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "-2147483648", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0,...#238#8687903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234567", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_INT, VALUE_STRING, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getF...#279#1117474160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getJsonFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writeValueAsBytes", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1268912675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(a,b,c), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0,...#263#1504730089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1.25), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#375666821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-2"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1e10), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#-318618414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-2"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(010), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, g...#261#-807282552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getVisibilityChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"011"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-2"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(011), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, g...#261#1311768423", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "enable", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffere...#221#-1384764006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "getSerializerFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", "java.lang.Class,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", "int,int", "-1", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffere...#221#-1384764006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setBase64Variant", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{"com.fasterxml.jackson.databind.SerializationFeature", "com.fasterxml.jackson.databind.SerializationFeature[]"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_newReader", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setMixIns", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "convertValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<s:a>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "writer", "com.fasterxml.jackson.databind.ser.FilterProvider", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_readValue", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<null>", "1", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature[]", "<null>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:64>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}), new String[][]{{"writeValues", "java.io.Writer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SequenceWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(12:30:45), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#584591933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "writer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "valueToTree", "java.lang.Object", "<i:-3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.Reader,com.fasterxml.jackson.core.type.TypeReference", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "findAndRegisterModules", ""}}), new String[][]{{"writeValue", "java.io.File,java.lang.Object", "2"}, {"canSerialize", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0.6"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", " ... (truncated "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0.6), START_OBJECT, FIELD_NAME( ... (truncated ), VALUE_NULL, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=fals...#305#1269614648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "setMixInResolver", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "reader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "com.fasterxml.jackson.databind.InjectableValues", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "readTree", "java.io.Reader", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:0>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "readValue", "java.io.Reader,com.fasterxml.jackson.core.type.TypeReference", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "enable", "com.fasterxml.jackson.databind.SerializationFeature", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#361483503", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#361483503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "addHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectMapper", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readerFor", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>"}, false), new String[][]{{"writeNumber", "java.math.BigInteger", "1"}, {"getHighestEscapedChar", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "reader", "java.lang.Class", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2", "15"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "readValue", new String[]{"java.io.InputStream", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_convert", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<i:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectMapper", "configure", "com.fasterxml.jackson.databind.SerializationFeature,boolean", "<sample:6>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "setVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.core.FormatSchema", "<null>", "<sample:7>"}}), new String[][]{{"getSubtypeResolver", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.ObjectMapper", "_newWriter", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectMapper", "setSerializerFactory", "com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectWriter", actual.getClass().getName());
  assertEquals("{hasPrefetchedSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{" for format ", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME( for format ), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestE...#251#1170909315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "-1"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:3>", "<null>", "16", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.5), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#456261432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
}
