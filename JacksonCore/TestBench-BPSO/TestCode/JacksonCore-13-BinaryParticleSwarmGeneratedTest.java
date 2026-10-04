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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<null>"}}), new String[][]{{"writeNull", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"setFeatureMask", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}), new String[][]{{"writeEndObject", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-6"}, false), new String[][]{{"version", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.2-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=2, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-2084765692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "I1.1224567", "<a>b</a>i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=23, isClos...#209#-1446865628", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"writeBinary", "java.io.InputStream,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1-26", "-2147483647"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:4>", "-2147483648"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "-3.4028235E38"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=13, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:7>", "<sample:8>", "-2147483647"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"<a>b</a="}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=12, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<empty>", "0", "2147483647"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteTypeId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canOmitFields", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "a baaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=39, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBooleanField", "java.lang.String,boolean", "\037", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2147483647, getOutputBuffered=10, isClosed...#207#-1166986066", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2147483647, getOutputBuffered=10, isClosed...#207#-1166986066", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:b >"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "-0.0", "3.4028235E38"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=21, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputTarget", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "overrideFormatFeatures", "int,int", "-2147483648", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteObjectId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=5, isClose...#208#788743360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"1.\r5e30/"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"t"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "useDefaultPrettyPrinter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_verifyValueWrite", "java.lang.String", "+"}}, 3), new String[][]{{"flush", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteBinaryNatively", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"writeNumber", "java.math.BigDecimal", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"L a"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 1), new String[][]{{"writeNumber", "java.math.BigInteger", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"67108869", "-65"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObjectRef", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNullField", "java.lang.String", "\u00e9;1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:2>"}}, 2), new String[][]{{"setCurrentValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"2147483647", "1073741819"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"1E-i"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getFormatFeatures", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"P1L", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeEndObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483642"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483642, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#797344736", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483642, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#797344736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "nukl", "<a>b</a>"}}, 1), new String[][]{{"getOutputTarget", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "int", "128"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "-39"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 2), new String[][]{{"copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-1", "512"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"--1 ", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinaryField", "java.lang.String,byte[]", "\n", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCurrentValue", "java.lang.Object", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}, 2), new String[][]{{"writeBooleanField", "java.lang.String,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"0", "16777189"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed...#207#-1794363687", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed...#207#-1794363687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5e300", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeEndArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=4, isClose...#208#1785815713", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "-20"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{}, 1), new String[][]{{"writeBinary", "java.io.InputStream,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "2020-01.01"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "useDefaultPrettyPrinter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-64"}, false, 0, null, 3), new String[][]{{"overrideFormatFeatures", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<s:4key>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"1.12345678901234567PT1H", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "{a>b</a>+1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=24, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "1", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getFormatFeatures", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"13", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<sample:5>", "10", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{" I"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"="}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-26", "-30"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getHighestEscapedChar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"2020-02-30T25:61:61", "0.1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=22, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"2147483642"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,int", "1.1234667890123456", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2147483642, getOutputBuffered=19, isClosed...#207#-268668054", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2147483642, getOutputBuffered=19, isClosed...#207#-268668054", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".5", "1E+100"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"1hTitle"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "1.\r5e300", "1-26"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canOmitFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=23, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,long", "010", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=8, isClose...#208#2092493597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:8>", "<empty>", "-2147483648", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"128", "16777221"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBooleanField", "java.lang.String,boolean", "1.5Hello, World", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false), new String[][]{{"reset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147479552"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"2020-01-01123456789012345678901234567890", "1E+100"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinaryField", "java.lang.String,byte[]", "1.5d", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"0", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"[01,2]"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"0FFFFFFFF"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"16385"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"10"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "overrideFormatFeatures", "int,int", "12", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"2147483647", "16777221"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"16394"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "close", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "1.1234667890123456", "0x123456789"}}), new String[][]{{"getOutputTarget", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=16394, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char", "\037"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCharacterEscapes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "E", "2147483646", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "java.lang.String", "1-26"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_constructDefaultPrettyPrinter", ""}}), new String[][]{{"setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x123456689", "<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "0"}, {"writeEndArray", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeUTF8String", "byte[],int,int", "<null>", "2", "-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"+0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=128, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#-1352089476", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCurrentValue", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-1065353213", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"5.", "2147483647", "-524283"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:b\u00e9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=13, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<sample:3>", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false), new String[][]{{"writeNull", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_decodeSurrogate", "int,int", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<sample:1>", "2147483647", "4194306"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_releaseBuffers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "-128"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObjectRef", "java.lang.Object", "<s:ley>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"010", "-8796093022207"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=17, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinaryField", "java.lang.String,byte[]", "a,{b,c", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,java.math.BigDecimal", "11-26", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"acc"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "2305843009213693952"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=25, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "16777186", "-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_constructDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:0>", "-2147483648", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "htt://example.com/a?b=cabc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:0>", "<sample:1>", "1073741822", "-27"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_constructDefaultPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "useDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"2147483647", "-2147450880"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_constructDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"010 "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeString", "char[],int,int", "<empty>", "128", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"1.12346678901234565."}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:3>", "<sample:3>", "2048", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canOmitFields", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=19, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"Hello, World12:30:45", "2147483647", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "\u00e8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"0E-5"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=4, isClose...#208#1785815713", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"-0.0", "2147483647"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "java.lang.String", "[[1,2]0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteBinaryNatively", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canOmitFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "2147483642", "2145386490"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{"int"}, new String[]{"33554560"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "int", "1073741823"}}), new String[][]{{"setCurrentValue", "java.lang.Object", "5"}, {"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"a,b,c-0.0", "-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=29, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"a,b,ci"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "8388610"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"h"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,double", "", "-0.9999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=20, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"1hE-5"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483642", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{";5.", "\t"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "java.lang.String", "[1,3]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBoolean", "boolean", "false"}}), new String[][]{{"writeEndObject", "com.fasterxml.jackson.core.JsonGenerator,int", "2"}, {"writeEndObject", "com.fasterxml.jackson.core.JsonGenerator,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "2005", "-2147483648"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"-1"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char[],int,int", "<null>", "128", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "double", "NaN"}}), new String[][]{{"writeNumber", "double", "2"}, {"overrideStdFeatures", "int,int", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=66, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=66, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-256", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:1>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "-2147483648"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "close", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char", "0"}}), new String[][]{{"isClosed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,double", "F", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:7>", "<sample:1>", "16"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"5", "4.9E-324"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:611hTitle"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}), new String[][]{{"writeNullField", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483583, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=7, isClose...#208#-1636869515", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483583, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=7, isClose...#208#-1636869515", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-112", "-2147483648"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"1E-5", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "2147483648.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=22, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=20, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "-2147483642"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"52PT1H", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=12, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "6917529027641081856"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBooleanField", "java.lang.String,boolean", "0x1F1.1234667890123456", "true"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_throwInternal", ""}}), new String[][]{{"writeNumber", "java.math.BigDecimal", "3"}, {"isClosed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=33, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:8>", "<empty>", "-2147483644"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "useDefaultPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"1hTitle"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinaryField", "java.lang.String,byte[]", "123456789012345678901234567890", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=48, isClos...#209#468763457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,int", "I", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}}), new String[][]{{"getSchema", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "34"}}), new String[][]{{"withObjectIndenter", "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=34, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"-0.03"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"2097152"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canWriteObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2097152, getOutputBuffered=0, isClosed=fal...#203#-236851279", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2097152, getOutputBuffered=0, isClosed=fal...#203#-236851279", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.\r5e300", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=15, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"56"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.5d1.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=15, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartObject", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"15."}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"2147483647", "96"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:5>", "<sample:0>", "10"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_constructDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"a,,b,c1-26"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-10"}, false), new String[][]{{"writeNullField", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:Dta>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[],int,int", "<null>", "2097153", "128"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char[],int,int", "<null>", "11", "-2147483648"}}), new String[][]{{"writeNumberField", "java.lang.String,java.math.BigDecimal", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"writeNumberField", "java.lang.String,java.math.BigDecimal", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61b,b,c"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "overrideFormatFeatures", "int,int", "128", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=24, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "java.io.InputStream,int", "<sample:2>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"", "128"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,int", "-0-", "256"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:10>"}, false), new String[][]{{"canWriteTypeId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_constructDefaultPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.2-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=2, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-2084765692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"L "}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "1.\r5d300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNullField", "java.lang.String", "+;"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canOmitFields", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.2-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=2, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-2084765692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1hVitle", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "java.lang.String", "**1"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObjectRef", "java.lang.Object", "<s:key1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=18, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.\r5e30<", "123"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=14, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"32767"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isClosed", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObjectFieldStart", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
