package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}}), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:5>", "<s:j>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:0>", "<s:key>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttributes", "java.util.Map", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTreeOrNull", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.DataInput"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.FormatFeature", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:4>", "<i:2>"}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaabaaaaaaaaaaaaaa"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withView", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "byte[],int,int", "<sample:0>", "536870954", "-2147483648"}}), new String[][]{{"with", "java.util.Locale", "0"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "5"}, {"readValues", "java.io.Reader", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"asDouble", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.lang.String", "1"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatFeature", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.DataInput"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "at", "java.lang.String", "/x1F"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "=-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.net.URL"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifyNoTrailingTokens", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1", "-1"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:0>", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.net.URL", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:1>", "<sample:6>", "<sample:3>", "<sample:4>", "<b:false>", "<null>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser", "<null>", "<sample:5>"}}), new String[][]{{"readValues", "java.io.Reader", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:6>", "<s:i>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<null>", "<sample:4>", "<sample:1>", "<sample:3>", "<d:-3.0>", "<sample:4>", "<sample:6>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:4>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getFactory", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<null>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "3325e30"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.InputStream", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.cfg.ContextAttributes", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.FormatFeature[]", "<sample:2>"}}, 3), new String[][]{{"readValue", "java.io.InputStream", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.DataInput"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "byte[],int,int", "<null>", "1", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getFactory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.File"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withAttributes", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<null>", "<null>", "<sample:5>", "<sample:3>", "<i:0>", "<sample:2>", "<sample:7>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<null>"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.JsonFactory", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForMultiRead", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifyNoTrailingTokens", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_inputStream", "java.io.File", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "byte[],int,int", "<null>", "10", "-2147483648"}}, 2), new String[][]{{"with", "com.fasterxml.jackson.core.JsonFactory", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", "com.fasterxml.jackson.core.TreeNode", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTreeOrNull", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:a>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttribute", "java.lang.Object,java.lang.Object", "<sample:0>", "<s:=a>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "I2020-01-01"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", new String[]{"com.fasterxml.jackson.databind.ObjectReader[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.net.URL", "<sample:4>"}, {"com.fasterxml.jackson.databind.ObjectReader", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "java.util.Locale", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withValueToUpdate", "java.lang.Object", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifyNoTrailingTokens", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:10>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeTree", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFormatDetection", "com.fasterxml.jackson.databind.deser.DataFormatReaders", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.InputStream", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<sample:4>", "false"}}), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_reportUndetectableSource", new String[]{"java.lang.Object"}, new String[]{"<d:-3.0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:6>", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "byte[],int,int", "<sample:1>", "2", "2"}, {"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "java.lang.String", "TITLE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.DataInput", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.FormatFeature[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "at", "java.lang.String", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.core.JsonParser$Feature[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndCloseAsTree", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.io.File"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutAttribute", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.DataInput", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttributes", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withAttribute", "java.lang.Object,java.lang.Object", "<s:j>", "<i:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "withAttributes", "java.util.Map", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_newIterator", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JsonDeserializer,boolean", "<null>", "<sample:6>", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_verifyNoTrailingTokens", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "writeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:2>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndClose", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "without", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withView", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.net.URL", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndReadValues", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<sample:2>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getInjectableValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "\n"}, {"com.fasterxml.jackson.databind.ObjectReader", "treeToValue", "com.fasterxml.jackson.core.TreeNode,java.lang.Class", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.lang.String", "2"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "byte[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getJsonFactory", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifyNoTrailingTokens", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getAttributes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_findTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "com.fasterxml.jackson.core.FormatSchema", "com.fasterxml.jackson.databind.InjectableValues", "com.fasterxml.jackson.databind.deser.DataFormatReaders"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "<sample:6>", "<b:true>", "<sample:0>", "<null>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.core.JsonFactory"}, new String[]{"<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.io.DataInput"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTreeOrNull", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withoutFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.DataInput", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withHandler", new String[]{"com.fasterxml.jackson.databind.deser.DeserializationProblemHandler"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "boolean"}, new String[]{"<null>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.reflect.Type", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bindAndReadValues", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.DataInput", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "byte[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_bindAsTree", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withRootName", new String[]{"java.lang.String"}, new String[]{"\t"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.node.JsonNodeFactory"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_initForReading", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.FormatFeature", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.net.URL"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "getConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_unwrapAndDeserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:3>", "<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"java.net.URL"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.ResolvedType"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.File", "<null>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", "com.fasterxml.jackson.databind.deser.DataFormatReaders$Match,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "byte[],int,int", "<null>", "2147483647", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"java.lang.String"}, new String[]{"a b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "createDeserializationContext", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.JsonFactory", "<sample:5>"}, {"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_newIterator", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JsonDeserializer", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_bind", "com.fasterxml.jackson.core.JsonParser,java.lang.Object", "<sample:0>", "<s:j>"}, {"com.fasterxml.jackson.databind.ObjectReader", "forType", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_prefetchRootDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature", "com.fasterxml.jackson.databind.DeserializationFeature[]"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.node.JsonNodeFactory", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.DataInput"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_reportUnkownFormat", "com.fasterxml.jackson.databind.deser.DataFormatReaders,com.fasterxml.jackson.databind.deser.DataFormatReaders$Match", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "withType", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndCloseAsTree", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValue", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.cfg.ContextAttributes"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readValues", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readTree", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}}), new String[][]{{"getMinorVersion", "", "7"}, {"getArtifactId", "", "3"}, {"getMajorVersion", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "treeAsTokens", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.InputStream", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_considerFilter", "com.fasterxml.jackson.core.JsonParser,boolean", "<null>", "false"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_detectBindAndClose", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "writeTree", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_new", new String[]{"com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_findRootDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "treeToValue", new String[]{"com.fasterxml.jackson.core.TreeNode", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_verifySchemaType", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.core.FormatFeature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.net.URL", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false), new String[][]{{"readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.ResolvedType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"a\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#311#-332733445", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "createArrayNode", ""}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withFeatures", "com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.io.Reader"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "with", "com.fasterxml.jackson.databind.InjectableValues", "<sample:0>"}}), new String[][]{{"findValues", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "readTree", new String[]{"java.lang.String"}, new String[]{"4."}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<null>", "<null>", "<sample:5>", "<sample:4>", "<sample:0>", "<sample:1>", "<null>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.lang.String", "true"}, {"com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "_inputStream", new String[]{"java.net.URL"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<sample:3>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withAttributes", "java.util.Map", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_new", "com.fasterxml.jackson.databind.ObjectReader,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,com.fasterxml.jackson.core.FormatSchema,com.fasterxml.jackson.databind.InjectableValues,com.fasterxml.jackson.databind.deser.DataFormatReaders", "<null>", "<null>", "<sample:5>", "<sample:3>", "<i:0>", "<sample:2>", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "readValue", "java.io.Reader", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readValues", "java.io.Reader", "<null>"}}), new String[][]{{"with", "com.fasterxml.jackson.core.JsonFactory", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ObjectReader", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "with", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.databind.DeserializationFeature,com.fasterxml.jackson.databind.DeserializationFeature[]", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.ObjectReader", "_bindAsTreeOrNull", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<sample:3>"}}), new String[][]{{"version", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<sample:2>"}}), new String[][]{{"getFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canParseAsync=true, canUseCharArrays=true, getFormatGeneratorFeatures=0, getFormatName=JSON, getFormatParserFeatures=0, getGeneratorFeatures=31, getParserFeatures=8193,...#225#934113734", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "withoutRootName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ObjectReader", "without", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}, {"com.fasterxml.jackson.databind.ObjectReader", "withRootName", "java.lang.String", "1.5f"}, {"com.fasterxml.jackson.databind.ObjectReader", "readTree", "java.io.Reader", "<sample:3>"}}), new String[][]{{"getFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.MappingJsonFactory", actual.getClass().getName());
  assertEquals("{canHandleBinaryNatively=false, canParseAsync=true, canUseCharArrays=true, getFormatGeneratorFeatures=0, getFormatName=JSON, getFormatParserFeatures=0, getGeneratorFeatures=31, getParserFeatures=8193,...#225#934113734", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ObjectReader", "com.fasterxml.jackson.databind.ObjectReader", "getAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl", actual.getClass().getName());
 }
}
