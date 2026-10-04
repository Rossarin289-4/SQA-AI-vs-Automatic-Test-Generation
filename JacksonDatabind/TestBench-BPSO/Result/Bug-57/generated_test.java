package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "java.lang.String", "1.2346678"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#-604607748", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:7>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:10>", "<sample:5>", "<sample:5>", "<sample:8>", "<sample:0>", "<sample:2>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:3>"}}), new String[][]{{"readValue", "java.io.Reader", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:2>", "<i:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withAttributes", "java.util.Map", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "`"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", "com.fasterxml.jackson.databind.deser.DataFormatReaders,com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:4>"}}, 2), new String[][]{{"readValues", "java.io.File", "3"}, {"getParser", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:7>", "false"}}, 3), new String[][]{{"readTree", "java.io.Reader", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#308#110713798", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"readTree", "java.io.Reader", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:6>", "<sample:5>", "<sample:0>", "<sample:4>", "<s:a>", "<sample:11>", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:3>", "<sample:1>"}}, 3), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:0>", "false"}, false, 1, new String[][]{}), new String[][]{{"canReadObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<i:16>"}, false, 5, new String[][]{}), new String[][]{{"readValue", "com.fasterxml.jackson.databind.JsonNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:10>"}, false, 4, new String[][]{}, 3), new String[][]{{"readTree", "java.io.InputStream", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#688669288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}), new String[][]{{"hasNext", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:6>", "<sample:4>", "<sample:7>", "<sample:5>", "<s:bb>", "<sample:0>", "<null>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<null>"}}, 2), new String[][]{{"readValues", "java.io.Reader", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:6>", "<sample:5>", "<sample:3>", "<sample:8>", "<s:Tkey>", "<sample:1>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}), new String[][]{{"readValue", "java.io.File", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:1>"}}), new String[][]{{"with", "java.util.TimeZone", "2"}, {"createArrayNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}}, 3), new String[][]{{"forType", "com.fasterxml.jackson.core.type.TypeReference", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"readTree", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}), new String[][]{{"hasNextValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 3), new String[][]{{"readValue", "com.fasterxml.jackson.databind.JsonNode", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:2>", "<s:Tkery>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<null>", "-2147483648", "-2"}}), new String[][]{{"getAttributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<i:16>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:0>", "false"}}, 1), new String[][]{{"withAttribute", "java.lang.Object,java.lang.Object", "1"}, {"readValues", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasNextValue=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:3>"}}), new String[][]{{"readValue", "com.fasterxml.jackson.databind.JsonNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "for format "}}, 3), new String[][]{{"readTree", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#308#-649420441", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:9>", "<sample:9>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:7>"}}), new String[][]{{"readValues", "java.io.InputStream", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:1>"}}), new String[][]{{"readValue", "java.io.Reader", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:7>"}}), new String[][]{{"readValues", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttribute", "java.lang.Object,java.lang.Object", "<s:>", "<d:3.0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:4>"}}), new String[][]{{"readValues", "byte[],int,int", "0"}, {"getParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<null>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.DeserializationFeature", "5"}, {"getAttributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:4>", "<empty>"}}, 2), new String[][]{{"readValue", "byte[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1), new String[][]{{"with", "com.fasterxml.jackson.core.FormatFeature", "1"}, {"readTree", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "at", "com.fasterxml.jackson.core.JsonPointer", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:3>", "<empty>"}}), new String[][]{{"with", "com.fasterxml.jackson.core.FormatSchema", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false), new String[][]{{"at", "java.lang.String", "0"}, {"readTree", "java.io.Reader", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:4>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:6>", "<s:ke\"y>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:7>", "<sample:7>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", "java.lang.Object", "<d:3.0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "at", "java.lang.String", "0x1F"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1", "0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:4>", "<s:\u00e9b>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatFeature", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:7>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!RuntimeException, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_newIterator", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JsonDeserializer,boolean", "<sample:6>", "<sample:3>", "<sample:4>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:12>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:3>"}}, 2), new String[][]{{"withAttributes", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonFactory", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.InjectableValues$Std", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttribute", "java.lang.Object,java.lang.Object", "<i:2>", "<d:1.5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bind", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:6>", "<s:La>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:9>"}}, 2), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<sample:1>"}}, 2), new String[][]{{"readValue", "java.net.URL", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"forType", "java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1073741824", "-1073741714"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getFactory", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3), new String[][]{{"readTree", "java.io.InputStream", "7"}, {"decimalValue", "", "4"}, {"asInt", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}}, 1), new String[][]{{"with", "com.fasterxml.jackson.core.JsonParser$Feature", "1"}, {"readValue", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-536870911", "2147483647"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{" for format "}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<null>", "true"}}, 3), new String[][]{{"with", "com.fasterxml.jackson.core.FormatSchema", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.TimeZone", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:7>", "<sample:0>"}}, 3), new String[][]{{"at", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>", "<sample:3>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"') for lxpe "}, false, 4, new String[][]{}, 2), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"') for txpe "}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "62"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.net.URL"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"java.lang.String"}, new String[]{"/"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:5>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", "java.lang.Object", "<i:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForReading", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:4>"}}), new String[][]{{"with", "com.fasterxml.jackson.core.JsonFactory", "3"}, {"readTree", "java.io.Reader", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:2>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:9>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:1>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_with", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:0>", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<sample:0>", "1", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"1.f"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:7>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<s:ke\"y>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:5>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>", "<sample:4>"}}), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}), new String[][]{{"readTree", "java.io.InputStream", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.core.JsonFactory", "<sample:4>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"I"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:4>"}}), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:7>", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "10"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"Root name '"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "7"}, {"getDeserializationFeatures", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15214880", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", "java.lang.Object", "<d:15.0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 4, new String[][]{}), new String[][]{{"treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:9>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", "java.lang.Object", "<d:3.0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false), new String[][]{{"with", "java.util.TimeZone", "7"}, {"readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}}), new String[][]{{"with", "com.fasterxml.jackson.core.FormatSchema", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForReading", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"1.2346678"}, false), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<sample:2>", "10", "10"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "2097152"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.TimeZone", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"a b"}, false), new String[][]{{"readValues", "byte[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"readValues", "byte[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getAttributes", ""}}), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:4>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}}), new String[][]{{"with", "java.util.Locale", "2"}, {"readValue", "java.io.Reader", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.File", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:2>"}}), new String[][]{{"readTree", "java.io.InputStream", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:1>", "<b:true>"}}), new String[][]{{"getAttributes", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", "java.lang.Object", "<s:ke\"y>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"i"}, false, 5, new String[][]{}), new String[][]{{"getConfig", "", "6"}, {"typeIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:1>"}}), new String[][]{{"readValue", "java.net.URL", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.TimeZone", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:3>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.InjectableValues", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "5"}, {"readValue", "com.fasterxml.jackson.core.JsonParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:1>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}), new String[][]{{"getFloatValue", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-1073741823", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"readTree", "com.fasterxml.jackson.core.JsonParser", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"readValues", "java.net.URL", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<sample:1>"}}), new String[][]{{"withoutSharedAttribute", "java.lang.Object", "3"}, {"withSharedAttributes", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false), new String[][]{{"getFactory", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForReading", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"readValues", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<null>"}}), new String[][]{{"readValues", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:4>", "true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false), new String[][]{{"treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}), new String[][]{{"readValues", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "7"}, {"with", "com.fasterxml.jackson.databind.InjectableValues", "3"}, {"at", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}), new String[][]{{"readTree", "java.io.InputStream", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser", "1"}, {"getParserSchema", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getMinorVersion", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonFactory", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:2>", "<sample:7>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.io.File"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getFactory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "1", "-1"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}}), new String[][]{{"getValueAsString", "", "2"}, {"getValueAsInt", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:0>", "<sample:7>"}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttributes", "java.util.Map", "<sample:0>"}}), new String[][]{{"getFactory", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>", "<sample:4>"}}), new String[][]{{"createParser", "java.lang.String", "3"}, {"getDoubleValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"addValue", "java.lang.Class,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", ""}}), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "4"}, {"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:7>", "true"}, false, 5, new String[][]{}), new String[][]{{"getInputSource", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayInputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}), new String[][]{{"readValues", "java.io.File", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:5>", "<null>"}}), new String[][]{{"readValues", "java.io.File", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 6, new String[][]{}), new String[][]{{"treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:0>", "true"}, false, 5, new String[][]{}), new String[][]{{"getCurrentTokenId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
