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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:5>", "<i:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "') fon type "}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.io.File", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}), new String[][]{{"at", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withAttribute", "java.lang.Object,java.lang.Object", "<i:2>", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 2), new String[][]{{"readValues", "java.io.InputStream", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "2.1335566"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}}), new String[][]{{"withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "166.1335566"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:0>"}}), new String[][]{{"readValue", "java.io.InputStream", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:6>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<null>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:11>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "10"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "5"}, {"with", "com.fasterxml.jackson.core.JsonFactory", "0"}, {"readValues", "java.io.File", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "20"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "5"}, {"forType", "com.fasterxml.jackson.databind.JavaType", "0"}, {"readValues", "java.io.File", "3"}, {"getParserSchema", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.File", "<null>"}}), new String[][]{{"findParents", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[],int,int", "<empty>", "1", "514"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:4>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!NullPointerException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getAttributes", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatFeature", "<sample:3>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "6"}, {"readValue", "com.fasterxml.jackson.databind.JsonNode", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<b:true>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"20"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[],int,int", "<empty>", "-1073741824", "10"}}), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "7"}, {"readValue", "com.fasterxml.jackson.databind.JsonNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "java.lang.String", "-21L"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "null"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.core.JsonFactory", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "Hello,} WWorld"}, {"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getFactory", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:4>"}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.net.URL", "<sample:7>"}}), new String[][]{{"getValueClass", "", "0"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonFactory", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:4>"}}, 3), new String[][]{{"getTypeFactory", "", "3"}, {"constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:0>"}}), new String[][]{{"createArrayNode", "", "5"}, {"add", "long", "5"}, {"booleanNode", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:4>"}}, 3), new String[][]{{"readTree", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:3>", "<sample:5>"}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "4"}, {"with", "java.util.TimeZone", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "-2147483616"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", "com.fasterxml.jackson.databind.deser.DataFormatReaders,com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "'* for t<pdx "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.databind.JsonNode", "<sample:8>"}}), new String[][]{{"readTree", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.databind.JsonNode", "<sample:13>"}}), new String[][]{{"readTree", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<empty>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", "java.lang.Object", "<s:7/>"}}), new String[][]{{"readTree", "java.io.Reader", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#688669288", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:7>"}}), new String[][]{{"withAttributes", "java.util.Map", "6"}, {"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "3"}, {"readValue", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:0>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:8>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.net.URL", "<sample:4>"}}, 2), new String[][]{{"isClosed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2), new String[][]{{"getJsonFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2), new String[][]{{"getJsonFactory", "", "5"}, {"createParser", "java.io.InputStream", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttributes", "java.util.Map", "<sample:3>"}}, 2), new String[][]{{"getJsonFactory", "", "5"}, {"createParser", "java.io.InputStream", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "') for type "}, {"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "') fon type "}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "') fon type "}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "') fon type "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:4>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withAttribute", "java.lang.Object,java.lang.Object", "<i:2>", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 1), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 1), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 1), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 1), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:11>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 2), new String[][]{{"getJsonFactory", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 2), new String[][]{{"readValues", "java.io.InputStream", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 2), new String[][]{{"version", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#-604607748", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 3), new String[][]{{"readValues", "java.io.InputStream", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "16.1335566"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<empty>"}}, 3), new String[][]{{"readValues", "java.io.InputStream", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.net.URL", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "166.13"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "66.1"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"readTree", "java.io.InputStream", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "121.12355678"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "121.1235567 "}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:4>"}}, 2), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "2"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "10E-5"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}}, 3), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "5"}, {"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"createParser", "byte[],int,int", "1"}, {"getCurrentTokenId", "", "7"}, {"getTokenLineNr", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "20"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:4>"}}, 3), new String[][]{{"treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:4>", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:2>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonFactory", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2), new String[][]{{"findParents", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", ""}}, 2), new String[][]{{"findParents", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1", "1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}}, 1), new String[][]{{"readValue", "java.io.File", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "Hello,} World"}}, 1), new String[][]{{"floatValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:2>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "2147483647"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<empty>"}}, 3), new String[][]{{"readValue", "com.fasterxml.jackson.databind.JsonNode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<null>"}}, 2), new String[][]{{"readValue", "com.fasterxml.jackson.databind.JsonNode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<null>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<null>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:4>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 1), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!NullPointerException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.File", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[]", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:4>", "false"}}, 2), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}, {"getParserSchema", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:1>"}}, 1), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}, {"getParserSchema", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", ""}}, 2), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!NullPointerException, hasNextValue=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "at", "java.lang.String", "1.5e300"}}, 1), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}, {"getParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<empty>"}}, 2), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}, {"getParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}}), new String[][]{{"readValue", "java.net.URL", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 6, new String[][]{}), new String[][]{{"getJsonFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[]", "<sample:2>"}}), new String[][]{{"getJsonFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:5>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bind", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:6>", "<sample:3>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:1>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:0>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:4>"}}), new String[][]{{"canReadObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.io.File", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:2>"}}), new String[][]{{"at", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.io.File", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.io.File", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:2>"}}), new String[][]{{"at", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<s:key>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:7>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}), new String[][]{{"forType", "com.fasterxml.jackson.core.type.TypeReference", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:6>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}), new String[][]{{"forType", "com.fasterxml.jackson.core.type.TypeReference", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:6>", "true"}}), new String[][]{{"forType", "com.fasterxml.jackson.core.type.TypeReference", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:6>", "true"}}), new String[][]{{"readValue", "java.io.File", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "com.fasterxml.jackson.core.JsonParser", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "10", "2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "26.1335566"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}}), new String[][]{{"withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "0"}, {"readValues", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.net.URL", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "16.1335566"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:0>"}}), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "0"}, {"readValues", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withView", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"5."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "166.1335566"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:6>"}}), new String[][]{{"readValues", "byte[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "166.13"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}}), new String[][]{{"readValues", "byte[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}}), new String[][]{{"getInjectableValues", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}}), new String[][]{{"getJsonFactory", "", "5"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.net.URL", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:4>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#-604607748", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bind", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<null>", "<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", new String[]{"com.fasterxml.jackson.core.JsonParser", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:1>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false), new String[][]{{"at", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "123456789012345678901234567890"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}}), new String[][]{{"getAttributes", "", "5"}, {"withSharedAttribute", "java.lang.Object,java.lang.Object", "6"}, {"withoutSharedAttribute", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:11>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:2>"}}), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "5"}, {"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "21"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:1>"}}), new String[][]{{"forType", "com.fasterxml.jackson.databind.JavaType", "4"}, {"with", "com.fasterxml.jackson.core.JsonFactory", "0"}, {"readValues", "java.io.File", "3"}, {"readAll", "java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:4>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.File", "<null>"}}), new String[][]{{"findParents", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<sample:1>", "2147483647", "2147483647"}}), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}), new String[][]{{"readValue", "java.io.File", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}), new String[][]{{"getTypeFactory", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatFeature", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.core.JsonFactory", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<null>"}}), new String[][]{{"version", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#-604607748", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>"}}), new String[][]{{"floatValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "Hello,} World"}}), new String[][]{{"floatValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}), new String[][]{{"floatValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "at", "com.fasterxml.jackson.core.JsonPointer", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:6>", "<null>"}}), new String[][]{{"getParserSchema", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:5>", "true"}, false), new String[][]{{"getParserSchema", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:1>", "<s:a>"}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<empty>", "0", "0"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[],int,int", "<empty>", "1", "514"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:2>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.io.File"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.io.FileInputStream", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>", "false"}, false), new String[][]{{"readAll", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean"}, new String[]{"<sample:8>", "<sample:1>", "<sample:0>", "false"}, false), new String[][]{{"readAll", "", "4"}, {"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<sample:1>"}}), new String[][]{{"readValue", "com.fasterxml.jackson.databind.JsonNode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:4>", "<sample:1>", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:4>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForReading", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:4>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:4>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}), new String[][]{{"getFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:4>", "false"}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}}), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "at", "java.lang.String", "1.5e300"}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "5"}, {"getParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"\t"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}}, 2), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.File", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}}, 2), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}, {"getParser", "", "3"}, {"hasCurrentToken", "", "4"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}}), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}, {"getParser", "", "3"}, {"hasCurrentToken", "", "4"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[],int,int", "<sample:0>", "-1", "-1"}, {"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.io.File", "<sample:0>"}}, 2), new String[][]{{"readValues", "java.io.InputStream", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 3), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}, {"getParser", "", "3"}, {"hasCurrentToken", "", "4"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=15214880, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 2), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}, {"getParser", "", "3"}, {"hasCurrentToken", "", "4"}, {"getValueAsString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>", "<null>", "<sample:1>", "<sample:3>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:6>"}}, 1), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}, {"getParser", "", "3"}, {"hasCurrentToken", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 3), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}, {"getParser", "", "3"}, {"hasCurrentToken", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 3), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}, {"readAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 3), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=!JsonParseException}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.TimeZone", "<null>"}}), new String[][]{{"readValue", "java.net.URL", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getAttributes", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 2), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
