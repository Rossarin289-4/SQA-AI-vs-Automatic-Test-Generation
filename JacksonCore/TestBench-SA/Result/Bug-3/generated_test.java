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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"55295"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}, {"getArtifactId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "55297"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "55297"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-standard token '"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#490#1154700026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:9>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}}), new String[][]{{"nextLongValue", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:9>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:9>", "false"}}, 1), new String[][]{{"nextLongValue", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", "int", "73"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", "int", "73"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1091974003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "110494"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"27648"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:12>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "-56322"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("27648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "--1"}}), new String[][]{{"readNBytes", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", new String[]{"int"}, new String[]{"-28198"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportOverflowInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", "java.lang.String,int", "true", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", new String[]{"int"}, new String[]{"1073798150"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"-2147483648"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetInt", new String[]{"boolean", "int"}, new String[]{"false", "1"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:3>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetInt", new String[]{"boolean", "int"}, new String[]{"false", "55220"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:3>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1091974003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "56321"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:9>", "-2147483648", "2147418113", "Non-standard token '"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#476#821076367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "0"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_releaseBuffers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", "int", "-25"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "-2041376"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", "int", "-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "115"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "56319", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "-524396"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "10", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setFeatureMask", "int", "-2147483584"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "2147483644"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#723604655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "67080641", "<empty>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "-56332"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "2147483647", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "-1073741777", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "-138116"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#1393089708", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "-117374975", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "45"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "2147483647", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int,int[]", "2147483647", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", new String[]{"int"}, new String[]{"45"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", "java.lang.String,int", "I", "1073798150"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "65535"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "-2147483538"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:9>", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", "boolean,int,int,int", "false", "-1", "1073798150", "-1048792"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", "java.io.OutputStream", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "65536", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1091974003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseEscapedName", "int[],int,int,int,int", "<sample:2>", "73", "1073798150", "73", "110494"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleInvalidNumberStart", new String[]{"int", "boolean"}, new String[]{"73", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String,java.lang.Throwable", "", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"O10", "55296"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "stringI "}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "12:30:45"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "10", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "-110594", "110594", "16"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "-221188", "55297", "16"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-547101429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "-112640"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "-555"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "-555"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}, 1), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}, {"getArtifactId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}, 1), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}, {"getArtifactId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}, 1), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}, {"getArtifactId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", "boolean,int,int,int", "true", "56303", "55275", "9"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:3>", "-2147483584", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "expected a value"}}, 3), new String[][]{{"printStackTrace", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0x80000040) as character #-2147483647 of 4-char base64 unit: can only used between units {getLocalizedMessage=Illegal white spac...#416#-91886682", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:1>", "10", "9"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:6>", "\000", "11"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nmn-standard to"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#485#2131191338", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nmn-standarc to"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#485#-1652763799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-stasdard tokken2 '"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#492#1017147776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-stasdard tnkken2 '"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#492#470755135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-stasdbrd tnkken2 '"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#492#1671896478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+NF", "<sample:1>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "0.16"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+NF", "<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "0.16"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+NF", "<sample:1>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "0.016"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+OF", "<sample:1>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "0.016"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "55296"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+OF", "<sample:1>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "56320"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "55296"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"a,b,c", "<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "56320"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "-55296.00000000001"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenCharacterOffset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenCharacterOffset", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenCharacterOffset", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenCharacterOffset", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenCharacterOffset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidChar", new String[]{"int"}, new String[]{"221184"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberType", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getShortValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.3.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=3, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "0x123456789"}}, 1), new String[][]{{"isUknownVersion", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "0x124456789"}}, 1), new String[][]{{"isUknownVersion", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleEOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getShortValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentTokenId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-518409560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1222261555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-547101429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenCharacterOffset", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAsTree", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", "long", "0"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "http://example.com/a?b=c"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#494#-1781839407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", "long", "0"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "http://example.com/a?b=c"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#494#243640971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", "long", "0"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "http://example.com/a?b=c"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#494#703224304", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "2147483647", "0"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String", "flse"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String", "flre"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String", "flre"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "1", "55297", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "-55297", "110594", "16"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "-221188", "55297", "16"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-547101429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMissingRootWS", "int", "65537"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMissingRootWS", "int", "65537"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1091974003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDoubleValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "2147483647", "1.5e300A"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "56320"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"name", "55296"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=55296, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrentName=null, g...#410#346708573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1.5e300", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 1.5e300\n at [Source: 2; line: 1, column: 1] {getLocalizedMessage=1.5e300\n at [Source: 2; line: 1, column: 1], getMessage=1.5e300\n at [Source: 2; line: 1,...#336#-845634913", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportBase64EOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "-555"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidChar", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String", "PT1H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportOverflowLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", new String[]{"int", "int"}, new String[]{"65535", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "65537", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "499"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:12>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseEscapedName", "int[],int,int,int,int", "<empty>", "55297", "56319", "-2", "9"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "499"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int", "java.lang.String"}, new String[]{"<sample:4>", "0", "55295", "http://example.com/a?b=c"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleInvalidNumberStart", "int,boolean", "65537", "false"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:12>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseEscapedName", "int[],int,int,int,int", "<empty>", "55297", "56303", "-2", "9"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getShortValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"55295"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#803218823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#803218823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#476#-1318122999", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#476#-1318122999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "56320", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.3.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=3, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "56408", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.3.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=3, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "56408", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.3.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=3, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "28204", "0xFFFFFFFF"}}), new String[][]{{"getMinorVersion", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "28204", "0xFFFFFFFF"}}), new String[][]{{"getMinorVersion", "", "2"}, {"getArtifactId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "28204", "0xFFFFFFFF"}}), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}, {"getArtifactId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}, {"getArtifactId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}, {"getArtifactId", "", "6"}, {"isUknownVersion", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{" bytes"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"a,b,c", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", ""}}), new String[][]{{"getColumnNr", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", ""}}), new String[][]{{"getColumnNr", "", "0"}, {"getLineNr", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"a"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", "boolean,int,int,int", "true", "56303", "55275", "9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", "boolean,int,int,int", "true", "56303", "55275", "9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "expected a value"}});
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0x80000000) as character #11 of 4-char base64 unit: can only used between units {getLocalizedMessage=Illegal white space charact...#407#2011607731", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenCharacterOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:2>", "-2147483644", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "expected a value"}}), new String[][]{{"getCause", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:5>", "-2147483584", "-68"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "expected a value"}}), new String[][]{{"printStackTrace", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0x80000040) as character #-67 of 4-char base64 unit: can only used between units {getLocalizedMessage=Illegal white space charac...#408#884316657", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:3>", "-2147483584", "128"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "expected a value"}});
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0x80000040) as character #129 of 4-char base64 unit: can only used between units {getLocalizedMessage=Illegal white space charac...#408#-279493849", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "10"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-68", "1e10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-68", "2e10"}}), new String[][]{{"getValueAsBoolean", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "68", "2e10"}}), new String[][]{{"getValueAsBoolean", "", "6"}, {"getShortValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", " in field name"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"11"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "55297"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "55297"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "55297"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "110494"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTypeId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNumber", "int", "11"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "110494"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetAsNaN", "java.lang.String,double", "12:30:45", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-17976931348623157000000000000000000000000000000000000000000.., getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException,...#513#-1823358238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setFeatureMask", "int", "-2147483584"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#723604655", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#723604655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigDecimal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"5.", "<sample:2>"}, false), new String[][]{{"getLocation", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Non-standard token '"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#490#-1989429766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-standard token '"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#490#-1330363685", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-standard tokken2 '"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#492#-516023226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-standard tokken2 '"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#492#1969040485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#1437059126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"Nnn-standard tokken2 '2020-02-30T25:61:61"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#511#-1553392421", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{" in field name", "<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+NF", "<sample:1>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "0.16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+NF", "<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", "double", "0.16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "55297", "PT1H"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 0; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToInt", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValuesAs", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", new String[]{"int"}, new String[]{"56319"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "55275"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", new String[]{"int"}, new String[]{"55275"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "10", "Non-standard token '"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-2.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:5>", " ", "56303"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseEscapedName", new String[]{"int[]", "int", "int", "int", "int"}, new String[]{"<sample:2>", "10", "55296", "-2147483584", "56321"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", new String[]{"int"}, new String[]{"65536"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String,java.lang.Throwable", "10", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_closeInput", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"string value"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", "int", "65536"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1222261555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-547101429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", ""}}), new String[][]{{"write", "byte[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "55275", "-1", "56319"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-2147483584"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1868729812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-518409560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenColumnNr", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_closeInput", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleInvalidNumberStart", new String[]{"int", "boolean"}, new String[]{"0", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#483#1547596384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1751077358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToInt", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-986887546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-1193569686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-518409560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1222261555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "http://example.com/a?b=cc"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "http://example.com/a?b=cc"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#-733986353", SearchInputFactory_scaffolding.receiverState());
 }
}
