package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", "int", "10"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"", "<sample:4>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"125'"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 53, 39]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTextLength", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDoubleValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "70"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"1234567891234567890U1234567890"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:10>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"23"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{":"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "65540"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", "int", "-48"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLocation", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:12>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_releaseBuffers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"101"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:8>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", "java.lang.String,java.lang.String", "n(l", "1e109"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "Unexpected end-of-input12:30:45", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", "java.lang.String", "rue"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", "java.lang.String", "1/'"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream", "byte[]"}, new String[]{"<sample:5>", "<sample:10>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "33", "<sample:4>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getInputSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:8>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "61", "2093"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:2>", "<sample:12>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "-262137"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"5.", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidBase64", "com.fasterxml.jackson.core.Base64Variant,char,int,java.lang.String", "<sample:7>", "\uffff", "2147483647", "false"}}), new String[][]{{"printStackTrace", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 5.\n at [Source: ; line: 1, column: 8] {getLocalizedMessage=5.\n at [Source: ; line: 1, column: 8], getMessage=5.\n at [Source: ; line: 1, column: 8], getOr...#313#1204893936", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidBase64", "com.fasterxml.jackson.core.Base64Variant,char,int,java.lang.String", "<sample:2>", "\000", "92", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int", "java.lang.String"}, new String[]{"<sample:7>", "0", "1048623", "2020-02-30T25:61:51"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "isExpectedStartObjectToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"-41"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextToken", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-41", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportBase64EOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumericValue", new String[]{"int"}, new String[]{"-8"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int", "-54"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"12"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberType", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportOverflowInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{","}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidBase64", "com.fasterxml.jackson.core.Base64Variant,char,int,java.lang.String", "<sample:12>", "o", "55295", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1/5", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", ""}}), new String[][]{{"getLocalizedMessage", "", "1"}, {"initCause", "java.lang.Throwable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", new String[]{"int"}, new String[]{"218"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAsTree", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextLongValue", "long", "-4611686018427387902"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream", "byte[]"}, new String[]{"<sample:12>", "<sample:2>", "<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", "java.lang.String,int", "", "-4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"-1.5", "<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String", "125"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", new String[]{"int", "int", "int"}, new String[]{"54", "45", "43"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setFeatureMask", "int", "44"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInvalidSpace", "int", "-12"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-689250164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream", "byte[]"}, new String[]{"<sample:11>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "1"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTypeId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseEscapedName", new String[]{"int[]", "int", "int", "int", "int"}, new String[]{"<empty>", "2147483647", "-6291433", "72", "59"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", "java.lang.String", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishAndReturnString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:11>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"-4"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:9>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:0>", "l", "35"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"-4611686018427387946"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", "int", "65537"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387946", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName2", new String[]{"int", "int"}, new String[]{"46", "-16330"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream", "byte[]"}, new String[]{"<sample:6>", "<sample:12>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishAndReturnString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleApos", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", "int", "55258"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishAndReturnString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"", "-1.27"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "36"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidChar", "int", "-262137"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-1, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=-1, getCurrentName=null, getCurrentToken=null,...#380#187796392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", "java.lang.String,int", "1;3", "-28"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"'"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumericValue", "int", "54"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", new String[]{"int"}, new String[]{"-14"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"8"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", "int", "-524277"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", "int", "75"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"17592186044428"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("17592186044428", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream", "byte[]"}, new String[]{"<sample:8>", "<sample:11>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", new String[]{"java.lang.String", "int"}, new String[]{") as character #1.1234567", "122"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream", "byte[]"}, new String[]{"<sample:4>", "<sample:10>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:9>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDoubleValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"-54"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMismatchedEndMarker", "int,char", "76", "R"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"41", ")"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "-21"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String,java.lang.String", "Unexpected cha-acter (", "nvllR"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"6.9"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", "int", "-47"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "150", "2147483647"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String,java.lang.String", "'-1", "Illegak character ("}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "44"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "65495", "67108882"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "126"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"252"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetInt", "boolean,int", "true", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"31"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", "C2147483638", "-2147483648"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", "' (code 0x", "268435708"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"1", "E"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", "java.lang.Object", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNumericValue", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_handleEOF", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"44"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentLocation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-689250164", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-689250164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}}, 1), new String[][]{{"toFullString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core/jackson-core/2.6.0-SNAPSHOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", "long", "-9223372036854775808"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "readValueAsTree", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_constructError", "java.lang.String,java.lang.Throwable", ") as cha:acter #", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"180"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", "java.lang.String", "3."}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "clearCurrentToken", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1.12345678901234567", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenCharacterOffset", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 1.12345678901234567\n at [Source: c; line: 1, column: 10] {getLocalizedMessage=1.12345678901234567\n at [Source: c; line: 1, column: 10], getMessage=1.1234...#387#-1786699584", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "123", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{"long"}, new String[]{"32767"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBooleanValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", "java.lang.String", " "}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#75157451", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCodec", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{"long"}, new String[]{"55297"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", "int", "-2147483648"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "version", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("55297", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDoubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getInputSource", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"020"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNumericValue", new String[]{"int"}, new String[]{"52"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsInt", "int", "13"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddValue", "int", "100"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"61.5: "}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getSchema", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNumericValue", new String[]{"int"}, new String[]{"69"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwUnquotedSpace", "int,java.lang.String", "65536", "[1,2]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", new String[]{"int", "int", "int"}, new String[]{"55297", "14", "65536"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidInitial", "int", "19"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:8>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextTextValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#872436258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetFloat", "boolean,int,int,int", "false", "555", "58", "65540"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleInvalidNumberStart", "int,boolean", "-6291422", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"-134"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int", "90"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", "int", "-12"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportBase64EOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", "java.lang.String,java.lang.Throwable", "(BTRL-CHAR, code 12:30:45", "<sample:4>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", "int,boolean", "2147483647", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextTextValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"931.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_codec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", new String[]{"java.lang.String"}, new String[]{"1.6d(CTRL-CHAR, code "}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNumericValue", "int", "1149"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "readValueAsTree", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "2147483647", "913"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleEOF", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetInt", "boolean,int", "true", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToInt", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "requiresCustomCodec", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"6291391"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", "java.lang.String", "e32"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{".-11.5f", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: .-11.5f\n at [Source: 2; line: 1, column: 1] {getLocalizedMessage=.-11.5f\n at [Source: 2; line: 1, column: 1], getMessage=.-11.5f\n at [Source: 2; line: 1,...#336#-1882406613", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", new String[]{"int", "int", "int"}, new String[]{"-6291422", "-28", "-2"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "skipChildren", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"16372"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_hasTextualNull", "java.lang.String", "0"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#478#879465975", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#478#879465975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"12:30:45' (code "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-92"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-92", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "isExpectedStartObjectToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDecimalValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#476#-1318122999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "requiresCustomCodec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"102", "3"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_codec", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", "java.lang.String", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"218"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"22:30:45", "<sample:5>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "U.1345678901234567", "<sample:12>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 5] {getByteOffset=-1, getCharOffset=4, getColumnNr=5, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDoubleValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getNumberValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"140x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getByteValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "readValuesAs", "java.lang.Class", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"100"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#476#821076367", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#476#821076367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenColumnNr", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", "double", "35"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidInitial", new String[]{"int"}, new String[]{"-6291422"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "-2.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"C"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "43"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwInternal", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "2", "100", "35"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNumericValue", new String[]{"int"}, new String[]{"65484"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:5>", "2147483647", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"71"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'G' (code 71)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "140", "57", "44"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigInteger", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:5>", "27648", "23"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"188"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\u00bc' (code 188)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"17"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", "java.lang.String,java.lang.Throwable", "nvll", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "93"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:1>", "f", "-64"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportUnexpectedChar", "int,java.lang.String", "-2147483648", "32123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getShortValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#481#1011220477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", new String[]{"java.lang.String"}, new String[]{" / 0x"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportUnexpectedChar", "int,java.lang.String", "-6291422", "PT1eG"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "requiresCustomCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", "java.lang.String", "+11.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-518409560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_constructError", "java.lang.String", ":\037"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"68", "http:/"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "20.0"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", "java.lang.String", "n8ll"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{": 1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 0; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleEOF", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "-2"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBigIntegerValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<null>", "45", "-16372", "2020-02-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"125"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", "int", "252"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "setCurrentValue", "java.lang.Object", "<i:58>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_closeInput", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-518409560", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-518409560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"124"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{"1_"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", "long", "65536"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getShortValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFloatValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleApos", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getEmbeddedObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"12"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"92"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", "java.lang.String", "/a/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDoubleValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMismatchedEndMarker", new String[]{"int", "char"}, new String[]{"-6291422", "f"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "-1073741824", "55295"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "setFeatureMask", "int", "262144"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#479#-140630231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getNumberType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:9>", "I", "-44"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_codec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddValue", "int", "11"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportError", "java.lang.String", "113"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"12345678901234567890U1234567890", "<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
