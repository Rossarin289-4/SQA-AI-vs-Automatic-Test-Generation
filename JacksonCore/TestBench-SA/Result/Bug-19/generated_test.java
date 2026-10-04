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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddName", "int", "65537"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", "double", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", "Unrecognized token '", "65537"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", "int,int", "56320", "2147483647"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#414843082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"-Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"-56319"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddValue", "int", "65536"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"PT1' f< r namef"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", "1E-5", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:2>", "32767", "65537"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 20, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 22, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "11", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetFloat", "boolean,int,int,int", "false", "0", "-1", "65535"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-241004789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1219973003", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1219973003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", ""}}), new String[][]{{"getValueAsString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1769752357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_closeInput", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:5>", "-2", "32768"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "-268402732"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"55297"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:6>", "65520", "11", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:4>", "v", "2147483642"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", "expected a value", "1610612991"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"110590"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", "int,int,int", "-2", "65389", "55296"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getByteArrayBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "65520"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:8>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"56320"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:5>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"65520"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:5>", "<sample:2>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", "int", "65537"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", "java.lang.String,int", "-INF", "2147483642"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", "int", "65537"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", "java.lang.String,int", "-INF", "2147483642"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1788483965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName2", "int,int", "56319", "110590"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "-56319"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", new String[]{"int"}, new String[]{"32739"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "skipChildren", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"32768"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int", "56320"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBigIntegerValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", "int", "-268402732"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", "int", "-536805458"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasCurrentToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "10", "512"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1788483965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMissingRootWS", "int", "-2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "-2147483586"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getInputSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleApos", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "2147483642", "{\"a\":1}"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMore", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", "java.lang.String", "Current token ("}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#472#2034876706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "1.12345678901234567", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "16369", "' for name"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToInt", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", "java.lang.String", "1.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", "java.lang.String", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 40, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLocation", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setFeatureMask", "int", "27648"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", "java.lang.String", "PT1' f< r namef"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", "int,int,int", "1", "-536805458", "32768"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", new String[]{"java.lang.String", "int"}, new String[]{"PT1' f< r namef", "11"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", new String[]{"java.lang.String", "int"}, new String[]{"PT1'", "11"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "32768"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "32768"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"1d10false"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleEOF", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", "java.lang.String,java.lang.String", "+INF", "1d10false"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "-536805460", "55296"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-917471226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"PT1H", "65536"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", "1.5f", "1610612735"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=65536, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrentName=null, g...#411#1335003479", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 40, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "-536805460", "55284"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#472#-1366373871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 42, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "-536805460", "55284"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#2002106398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"1073741823"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:3>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"89077"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:3>", "<sample:2>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"44538"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:3>", "<sample:2>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", "int,char", "65536", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"32768"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"536870911"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870911", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-536805424"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetAsNaN", "java.lang.String,double", "56320", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536805424", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=179769313486231570000000000000000000000000000000000000000000.., getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException,...#498#-1784059874", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleEOF", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<sample:1>", "9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishAndReturnString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMismatchedEndMarker", "int,char", "-536870902", "v"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"-140737488299004"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:4>", "-536805424", "32767", "1d10false"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "512", "1d10false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:8>", "<sample:2>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:5>", "<sample:1>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleEOF", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", "java.io.OutputStream", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "27648"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", "java.io.OutputStream", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1464349211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName", "int", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidChar", "int", "10"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "-2147483647"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 38, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 40, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextToken", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#472#-1366373871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "1073741824"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:3>", "<empty>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1788483965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "-1073741824"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:2>", "<empty>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", "java.lang.Class", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", "int,int", "56320", "2147483647"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", "int,int", "56320", "2147483647"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", "int,int", "56320", "2147483647"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#414843082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", "int,boolean", "65537", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-1073741824"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"1073741824"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"1073741824"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"1073741876"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741876", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"55297"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("55297", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"110594"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110594", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"221188"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("221188", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleInvalidNumberStart", "int,boolean", "55297", "false"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"8589990911"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddValue", "int", "65536"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"-e", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1.5f", "<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", "long", "8589990911"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", "long", "8589990911"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", "long", "8589990911"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", "long", "8589990911"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", "java.io.OutputStream", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", "int,boolean", "9", "false"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-2080374784", "-1073741880"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "56320", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", new String[]{"int", "boolean"}, new String[]{"36", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", new String[]{"int", "char"}, new String[]{"-1", "E"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", "java.lang.String", "2020-01-01"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"PT1' f r name"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:4>", "56323", "28"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"-2147483392"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentTokenId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"55296"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"+Infinity", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-2", "I"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "true"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", ""}}, 2), new String[][]{{"getValueAsString", "java.lang.String", "3"}, {"getDecimalValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", ""}}, 1), new String[][]{{"getValueAsString", "java.lang.String", "3"}, {"getDecimalValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1219973003", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1219973003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#483270052", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#483270052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getObjectId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}}, 1), new String[][]{{"getTypeId", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1219973003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}}, 1), new String[][]{{"isExpectedStartArrayToken", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "65537"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "65537"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "65537"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#414843082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "65537"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "1610612735"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#2091013765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "1610612735"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "1610612991"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "1610612991"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1464349211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", "int", "1610612991"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#2091013765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#369011079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"55295", "\t"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#2091013765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:0>", "55295", "11"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal character (code 0xd7ff) in base64 content {getLocalizedMessage=Illegal character (code 0xd7ff) in base64 content, getMessage=Illegal character (code 0xd7ff)...#315#-134813173", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "56319", "1", "65535"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidInitial", "int", "55295"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", "int", "9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "skipChildren", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#414843082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "-Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigInteger", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", "java.lang.String", "+INF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", "int,int", "56320", "2147483647"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "'"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1788483965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1464349211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code 11)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"53"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'5' (code 53)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"106"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'j' (code 106)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", "java.io.Writer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidInitial", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleInvalidNumberStart", "int,boolean", "55297", "false"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"28159"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleInvalidNumberStart", "int,boolean", "55297", "false"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28159", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#468#567389525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"-2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"8589990911"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", new String[]{"int", "int"}, new String[]{"11", "-2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"-Infinity", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", "java.lang.String", "1.5f"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1815667798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", "int,boolean", "9", "false"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", "java.io.Writer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "10"}}), new String[][]{{"isUnknownVersion", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwInvalidSpace", "int", "10"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwInvalidSpace", "int", "10"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "10"}}), new String[][]{{"getArtifactId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwInvalidSpace", "int", "10"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextLongValue", "long", "10"}}), new String[][]{{"getArtifactId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"56320", "55296"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getParsingContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseIntValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "skipChildren", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: abc\n at [Source: 1.5; line: 1, column: 1] {getLocalizedMessage=abc\n at [Source: 1.5; line: 1, column: 1], getMessage=abc\n at [Source: 1.5; line: 1, colum...#326#1416166440", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", new String[]{"int", "boolean"}, new String[]{"-2", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", new String[]{"int", "char"}, new String[]{"-2147483648", "a"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddName", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"65536", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "resetInt", "boolean,int", "false", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:1>", "56321", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:3>", "-268402732", "131170"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "65537", "10", "131170"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", "int,int", "65535", "56321"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValuesAs", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", "java.lang.String", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "11", "'"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetFloat", "boolean,int,int,int", "false", "0", "-1", "65535"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1464349211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", new String[]{"int"}, new String[]{"65535"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", new String[]{"int"}, new String[]{"65479"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
