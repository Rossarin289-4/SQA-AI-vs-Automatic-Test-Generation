package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:1>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "0xFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:6>", "<sample:6>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.File", "<sample:2>"}}), new String[][]{{"withAttribute", "java.lang.Object,java.lang.Object", "0"}, {"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=3, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.net.URL", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:2>"}}), new String[][]{{"readValues", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:2>", "<sample:1>", "<sample:7>", "<sample:6>", "<d:-21.5>", "<sample:2>", "<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:7>", "<sample:3>"}}), new String[][]{{"readValues", "byte[],int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<s:jey>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:11>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[],int,int", "<sample:0>", "-1073741879", "-1"}}), new String[][]{{"readTree", "java.io.InputStream", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.net.URL", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:10>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.InjectableValues", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"readValue", "java.io.Reader", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "1.5e300"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:0>", "<s:}>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:2>", "<sample:1>", "<sample:0>", "<sample:11>", "<i:25>", "<sample:6>", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:10>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:6>", "<sample:12>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:6>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<sample:5>", "4", "0"}}, 2), new String[][]{{"withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "6"}, {"with", "com.fasterxml.jackson.core.JsonFactory", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}), new String[][]{{"readValue", "byte[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}), new String[][]{{"readValue", "java.io.InputStream", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:1>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.Base64Variant", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "null"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", "com.fasterxml.jackson.databind.deser.DataFormatReaders,com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"getTypeFactory", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", "java.lang.Object", "<s:r>"}}, 2), new String[][]{{"readValue", "com.fasterxml.jackson.databind.JsonNode", "6"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<sample:4>"}}, 1), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "0"}, {"with", "com.fasterxml.jackson.databind.DeserializationFeature", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:1>"}}), new String[][]{{"withAttributes", "java.util.Map", "6"}, {"getConfig", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=1838224, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:6>", "<sample:4>", "<sample:8>", "<sample:9>", "<i:-1>", "<sample:3>", "<sample:2>", "<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.io.File"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withView", "java.lang.Class", "<sample:0>"}}), new String[][]{{"reset", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>"}}), new String[][]{{"readTree", "java.io.Reader", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:0>", "<sample:6>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "1.12345678"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:1>", "<null>", "<sample:4>", "<sample:4>", "<s:fbf>", "<sample:0>", "<sample:2>", "<sample:8>"}}), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:0>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:1>"}}, 1), new String[][]{{"createArrayNode", "", "7"}, {"add", "double", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[-1.0] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, i...#314#-1347824851", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}, 3), new String[][]{{"getAttributes", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<sample:1>", "-2147483648", "-1073741879"}}), new String[][]{{"withAttributes", "java.util.Map", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<null>", "<sample:2>"}}), new String[][]{{"readTree", "java.io.Reader", "7"}, {"fieldNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:2>", "true"}}), new String[][]{{"readTree", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "version", ""}}), new String[][]{{"readValue", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:3>", "<null>", "<sample:0>"}}, 2), new String[][]{{"getJsonFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<s:jery>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForReading", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 3), new String[][]{{"readValues", "java.io.InputStream", "7"}, {"readAll", "java.util.List", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonFactory", "<null>"}}), new String[][]{{"readValue", "java.io.InputStream", "7"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:9>", "<sample:0>", "<sample:1>", "<null>", "<s:4>", "<sample:0>", "<sample:9>", "<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[],int,int", "<null>", "1073741879", "1"}, {"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}}), new String[][]{{"readValues", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.net.URL"}, new String[]{"<null>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.5.3-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=5, getPatchLevel=3, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "+1i"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:2>", "<sample:7>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:6>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}, 1), new String[][]{{"setAttribute", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.5.3-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=5, getPatchLevel=3, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:6>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>", "<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:6>"}}, 3), new String[][]{{"mappingException", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not deserialize instance of java.lang.Object out of null token\n at [Source: 2; line: 1, column: 1] {getLocalizedMessage=Can not deserialize ins...#513#-585591936", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:4>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}}, 1), new String[][]{{"with", "com.fasterxml.jackson.databind.AnnotationIntrospector", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=1838224, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<sample:4>", "-1", "-1073741824"}, {"com.fasterxml.jackson.databind.ObjectReader", "withView", "java.lang.Class", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:8>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.File", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:12>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:8>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withView", "java.lang.Class", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "withView", "java.lang.Class", "<null>"}}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonFactory$Feature,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:4>", "<sample:0>", "<sample:8>", "<sample:3>", "<i:0>", "<sample:1>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:3>", "<sample:12>", "<sample:5>", "<sample:9>", "<s:b>", "<sample:9>", "<sample:9>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 3), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "6"}, {"getParserSchema", "", "0"}, {"getParserSchema", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:2>", "<sample:4>", "<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}}, 2), new String[][]{{"getAttribute", "java.lang.Object", "6"}, {"withSharedAttributes", "java.util.Map", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"with", "com.fasterxml.jackson.databind.AnnotationIntrospector", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=1838224, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:5>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bind", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:3>", "<d:1.5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:6>", "<null>", "<sample:8>", "false", "<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", "java.io.InputStream", "<sample:4>"}}, 1), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<null>", "true"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:1>", "<d:0.15750000000000003>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa for format "}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "1.1234567"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 7, new String[][]{}, 3), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:6>", "<sample:4>", "<sample:1>", "false", "<s:ke2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<d:0.15750000000000003>"}}, 3), new String[][]{{"readAll", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}}, 3), new String[][]{{"with", "com.fasterxml.jackson.databind.InjectableValues", "0"}, {"readValues", "java.io.Reader", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 2), new String[][]{{"createArrayNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.databind.JsonNode", "<sample:1>"}}, 3), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"Ttle"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match"}, new String[]{"<sample:0>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:8>", "<sample:2>"}, false, 7, new String[][]{}, 1), new String[][]{{"parseDate", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"010-11"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<null>", "false"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match"}, new String[]{"<sample:7>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.net.URL", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:6>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.TimeZone", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "a b1.1234567890123456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:1>", "<sample:7>", "<sample:6>", "<sample:6>", "<s:k\rey>", "<sample:0>", "<sample:4>", "<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:5>", "<sample:4>", "<sample:10>", "true", "<d:0.75>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<s:jey>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:10>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[],int,int", "<sample:4>", "2147483647", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.ObjectReader[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.io.File"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:5>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"2020-0-30T25:61:61"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<null>"}}), new String[][]{{"readValue", "java.net.URL", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:5>", "<d:6.550000000000001>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.DeserializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDeserializationFeatures=1838224, getRootName=null, isAnnotationProcessingEnabled=true, shouldSortPropertiesAlphabetically=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:4>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:7>", "<sample:5>", "<sample:7>", "<sample:9>", "<s:key>", "<sample:7>", "<sample:9>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{"0"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", "com.fasterxml.jackson.databind.deser.DataFormatReaders,com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.File", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:2>", "<d:-6.550000000000001>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:7>", "<sample:7>", "<sample:12>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:5>", "<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:8>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "java.lang.String", ";a>b</a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:1>", "<sample:4>", "<null>", "<sample:5>", "<s:>", "<sample:6>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<d:7.5>"}, false, 7, new String[][]{}), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:0>", "<s:j>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1", "0"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonFactory", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bind", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:9>", "<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>", "<sample:4>", "false", "<s:>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!RuntimeException, hasNextValue=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:7>"}}), new String[][]{{"createJsonParser", "byte[]", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<s:[b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}), new String[][]{{"with", "java.util.TimeZone", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getAttributes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=!ArrayIndexOutOfBoundsException, hasNextValue=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, false), new String[][]{{"with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "6"}, {"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>", "<sample:12>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>", "<sample:5>", "false", "<i:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}), new String[][]{{"hasNext", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:0>", "<sample:9>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<null>", "<sample:1>", "true", "<s:b>"}, false, 4, new String[][]{}), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:5>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:9>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false), new String[][]{{"getAnnotationIntrospector", "", "2"}, {"findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "0"}, {"findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>", "<sample:1>", "<sample:4>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "byte[],int,int", "<empty>", "10", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.net.URL", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "8", "-11"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:0>", "<i:-2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:1>", "<s:['b>"}}), new String[][]{{"readValues", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}), new String[][]{{"useRootWrapping", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:4>", "<sample:4>", "<sample:3>", "false", "<i:2>"}, false, 7, new String[][]{}), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:8>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:7>", "<s:_b>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:5>", "<d:5.4750000000000005>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", "java.lang.Object", "<s:\u00e9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false), new String[][]{{"createJsonParser", "java.io.InputStream", "6"}, {"getCurrentValue", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:8>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isArray", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getMajorVersion", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withHandler", "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:7>", "<s:jemy>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:3>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{" aaaaaaaaaaaaataaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.TimeZone", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{}), new String[][]{{"createArrayNode", "", "0"}, {"getNodeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("ARRAY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:3>", "<b:true>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:1>"}}), new String[][]{{"readValue", "java.io.File", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:-16>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:0>"}}), new String[][]{{"getJsonFactory", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:8>", "<sample:7>"}, false, 5, new String[][]{}), new String[][]{{"with", "com.fasterxml.jackson.core.JsonFactory", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "java.lang.String", "1.1234567C0xFFFFFFF"}}), new String[][]{{"arrayNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}), new String[][]{{"constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "4"}, {"isEnumType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getConfig", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"introspectClassAnnotations", "com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bind", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:0>", "<s:bb>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.core.JsonFactory", "<sample:10>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:10>", "<i:-1>"}}), new String[][]{{"unknownTypeException", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Could not resolve type id '0' into a subtype of [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contain...#687#-972333987", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getFactory", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", ""}}), new String[][]{{"reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:11>"}}), new String[][]{{"canUseCharArrays", "", "6"}, {"createGenerator", "java.io.OutputStream,com.fasterxml.jackson.core.JsonEncoding", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:6>", "<s:C>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:8>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canUseCharArrays=true, getFormatName=JSON, getRootValueSeparator= }", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.5.3-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=5, getPatchLevel=3, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:3>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}), new String[][]{{"with", "com.fasterxml.jackson.databind.DeserializationConfig", "1"}, {"readTree", "java.io.InputStream", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttribute", "java.lang.Object,java.lang.Object", "<s:a>", "<s:[b>"}}), new String[][]{{"readTree", "java.io.Reader", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:11>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getAttributes", ""}}), new String[][]{{"constructRawCollectionType", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Integer, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljava/lang/Object;>;, getType...#531#666275989", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:7>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}abc"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<d:0.31500000000000006>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:0>", "<sample:5>"}, false), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "1073741823", "-1073741824"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:10>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.File", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:10>", "<sample:3>", "<sample:2>", "true", "<s:[b>"}, false, 5, new String[][]{}), new String[][]{{"hasNextValue", "", "4"}, {"close", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasNextValue=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isUknownVersion", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bind", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Object"}, new String[]{"<sample:6>", "<s:d>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:0>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
}
