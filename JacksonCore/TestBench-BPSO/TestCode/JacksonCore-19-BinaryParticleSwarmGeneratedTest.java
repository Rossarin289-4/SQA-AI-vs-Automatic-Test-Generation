package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", "java.lang.String", "nameCurrent token ("}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<null>", "<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", new String[]{"java.lang.String", "int"}, new String[]{"-1'5", "16777226"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:4>", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddValue", new String[]{"int"}, new String[]{"18"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", "java.lang.String", " 4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", new String[]{"java.lang.String", "int"}, new String[]{"nameCurrent to'ken (", "-2147221503"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"PT1H1.12345678901234567", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getInputSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleApos", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:0>", "-134162433", "1", "vI"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", new String[]{"java.lang.String", "int"}, new String[]{"555296-1", "-134162433"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", "java.io.Writer", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parsePosNumber", "int", "-134162433"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportMissingRootWS", "int", "55295"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidOther", "int,int", "2147221503", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidChar", "int", "-1073741824"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", "int", "56308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", new String[]{"int"}, new String[]{"-992255"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", "int", "110594"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "-269427711", "expcted  vamue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:2>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getParsingContext", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "33619968"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:2>", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseLongName", new String[]{"int", "int", "int"}, new String[]{"-1", "-28123", "-131074"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:0>", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleApos", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "-2147483647", "2020-02-30T25:61:61): "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String,java.lang.String", "abc-0.0", "0TITLE"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "parseMediumName2", "int,int", "65838", "4063230"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "110594", "0y123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#467#-954817076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishAndReturnString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "56320"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishAndReturnString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", "java.lang.String", "Current token ("}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parsePosNumber", new String[]{"int"}, new String[]{"-5"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "124", "/bXb"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getByteArrayBuilder", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "-138352641"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportOverflowLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:0>", "<sample:3>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", "java.lang.String", "abc-0./"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", "boolean,int,int,int", "true", "9", "55296", "112638"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "20"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "65838", "I1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", ",-1NaN", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleApos", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "releaseBuffered", "java.io.OutputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5328+1", "6553FF6"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", "int", "56303"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"expfct ed  value"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleApos", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:2>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidToken", "java.lang.String", "-0'5-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483643"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "-269427519"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483643", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"1072749569"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", "java.lang.String,int", "+Infinitz", "8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"2125312", "1.134567"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", "long", "282574488393729"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"10): "}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_matchToken", "java.lang.String,int", "", "65535"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 10): \n at [Source: 0; line: 1, column: 1] {getLocalizedMessage=10): \n at [Source: 0; line: 1, column: 1], getMessage=10): \n at [Source: 0; line: 1, colum...#328#-1675459324", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"-."}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<null>", "<sample:1>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseNegNumber", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "slowParseName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipCR", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLocation", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:7>", "<null>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "43"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToDouble", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"274877906944"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:5>", "<empty>", "<sample:3>"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("274877906944", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "65537", "55296", "-1073741824"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "27695"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "vH--1", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"-34588160"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}), new String[][]{{"isSnapshot", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToDouble", ""}}, 3), new String[][]{{"getByteOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:0>", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", new String[]{"int", "boolean"}, new String[]{"65521", "false"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "Current token ("}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"49454"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\uc12e' (code 49454 / 0xc12e)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getIntValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleEOF", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:7>", "-206831", "-10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:3>", "L", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "-Infjnity", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleEOF", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"55297", "56321"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getSchema", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenCharacterOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{"long"}, new String[]{"56319"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "1", "1Ek6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("56319", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleEOF", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToDouble", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTokenColumnNr", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "-2147483648", "131119", "-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFloatValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{" "}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"33619968"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code 33619968)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInternal", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "2147483647", "OU1H"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseIntValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:7>", "<empty>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#483270052", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#483270052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getIntValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", "int,char", "9", "b"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"2251799813741696"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"expected a value0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", "int,char", "2147483647", "c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideCurrentName", "java.lang.String", "\t12:30:45+Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#484#-1884112300", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "9", "56321", "-2147483648"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 1.5; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMore", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483136", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:8>", "-33619968", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_releaseBuffers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "-1'4", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", "java.io.Writer", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDecimalValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", new String[]{"java.lang.String"}, new String[]{",1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getByteArrayBuilder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", "java.lang.String", "Non-standard token '010"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"0x12346789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 49, 50, 51, 52, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:4>", "x", "2147483647"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMore", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseAposName", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipCR", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_matchToken", new String[]{"java.lang.String", "int"}, new String[]{"1E-5", "-65536"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "27695", "[1,2]true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMore", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "1", "-1.5' for nn`me"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:5>", "<sample:4>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"5-"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:2>", "-2147483647", "131072"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"expfcted a value", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getSchema", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getText", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFloatValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:4>", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getTextOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 0; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLocation", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"' "}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: ' \n at [Source: 2; line: 1, column: 1] {getLocalizedMessage=' \n at [Source: 2; line: 1, column: 1], getMessage=' \n at [Source: 2; line: 1, column: 1], ge...#316#-1139879690", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"01/"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 01/\n at [Source: 2; line: 1, column: 1] {getLocalizedMessage=01/\n at [Source: 2; line: 1, column: 1], getMessage=01/\n at [Source: 2; line: 1, column: 1],...#320#1526534858", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getText", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"M"}, false), new String[][]{{"getStackTrace", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.StackTraceElement;", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586), java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method), java.base/jdk.internal.reflect.NativeMetho...#852#-92971240", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"112640"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\ub800' (code 112640 / 0x1b800)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeCharForError", new String[]{"int"}, new String[]{"-55296"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"529"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 529\n at [Source: 0; line: 1, column: 1] {getLocalizedMessage=529\n at [Source: 0; line: 1, column: 1], getMessage=529\n at [Source: 0; line: 1, column: 1],...#320#-1897124116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"27695"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", "int", "65838"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", new String[]{"int", "char"}, new String[]{"-2147483136", "\037"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "1", "-1.5' for nname"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"524288"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentTokenId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"65838", "27"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.8-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=8, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-865260092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"Titlf", "0.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=0, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=null, getCurrentToken=null, g...#386#-157918472", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_loadToHaveAtLeast", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "112600", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "canReadObjectId", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_parseName", "int", "-1073741824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "-1", "2147483647", "55354"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"60417"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#465#485409266", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#465#485409266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", "double", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "187339", ".51D-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString2", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 4, new String[][]{}), new String[][]{{"getProcessor", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"555296", "I"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddName", new String[]{"int"}, new String[]{"-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getInputSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getNumberValue", ""}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayInputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", ""}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "skipChildren", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"L"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[76]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "nextValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetInt", new String[]{"boolean", "int"}, new String[]{"false", "-1073741848"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigInteger", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"-INF"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 73, 78, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "131072", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#473#479091112", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#458#-2100901992", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"' for .ame"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "72", "TitlfCurrent token ("}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "http://example.com/a?b=c", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"Unrecognized token '"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[85, 110, 114, 101, 99, 111, 103, 110, 105, 122, 101, 100, 32, 116, 111, 107, 101, 110, 32, 39]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddName", "int", "55297"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_skipString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNextChar", new String[]{"java.lang.String"}, new String[]{"Hello, Vorld"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNumericValue", "int", "65555"}, {"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseAposName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleUnexpectedValue", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "0", "33619968", "Hello, World"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_finishString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0x0) as character #33619969 of 4-char base64 unit: can only used between units: Hello, World {getLocalizedMessage=Illegal white ...#420#1461860357", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "64572", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleInvalidNumberStart", "int,boolean", "-27648", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseNegNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:0>", "<sample:3>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", "int,char", "65536", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#2136845768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleEOF", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_constructError", "java.lang.String", "1.12345678901234561.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "-10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"-10", "65536"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"falsename"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"-1073741824", " 4d"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_handleApos", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_skipString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidToken", "java.lang.String", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_isNextTokenNameMaybe", "int,java.lang.String", "-65555", "56328+1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:1>", "27647", "67165131"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal character '\u6bff' (code 0x6bff) in base64 content {getLocalizedMessage=Illegal character '\u6bff' (code 0x6bff) in base64 content, getMessage=Illegal character '\u6bff' (...#327#559373621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{"expected  value"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_readBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream,byte[]", "<sample:6>", "<empty>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "-NF", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_parseIntValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleOddName", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
