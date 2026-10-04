package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"2.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<empty>", "2147483647", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isC...#212#953194277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:7>", "<null>", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "9223372036854775807"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}), new String[][]{{"isSnapshot", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "0x1F", "-3.4028235E38"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.5d", "0.1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}}, 2), new String[][]{{"getTextCharacters", "", "2"}, {"getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"21147483648[objectId=abc"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "-1.7976931348623157E308"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", "byte[],int,int", "<empty>", "-1", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(21147483648[objectId=abc)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsc...#227#1956537836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"16", "1.0"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-2147483648", "<i:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"7 1.4d", "-4.5"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "abdL-1", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(abdL-1), VALUE_TRUE, VALUE_EMBEDDED_OBJECT, FIELD_NAME(7 1.4d), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=fa...#264#-1898398914", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:oa>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:888>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=888]VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:t>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:888>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#1049543232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}, 1), new String[][]{{"hasTextCharacters", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "1W6"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<sample:3>"}}), new String[][]{{"getTokenLocation", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: N/A; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:6>"}}), new String[][]{{"getCodec", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=f...#205#-1206673739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", ""}}), new String[][]{{"getEmbeddedObject", "", "3"}, {"getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:2>"}}, 3), new String[][]{{"isClosed", "", "5"}, {"getTextOffset", "", "0"}, {"clearCurrentToken", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#472#1598665032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}}), new String[][]{{"getTextLength", "", "6"}, {"getObjectId", "", "3"}, {"clearCurrentToken", "", "3"}, {"getTypeId", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:\"0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:8>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:6>"}}, 2), new String[][]{{"getTextLength", "", "2"}, {"getObjectId", "", "0"}, {"clearCurrentToken", "", "3"}, {"getParsingContext", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=\"0]VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#1911387171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectRef", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=207, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:8>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<s:t>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "0"}}), new String[][]{{"isExpectedStartArrayToken", "", "4"}, {"peekNextToken", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<s:O>"}}), new String[][]{{"getTextCharacters", "", "3"}, {"getValueAsString", "", "5"}, {"nextTextValue", "", "1"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrentName=null, getC...#465#-261966727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:8>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}}, 2), new String[][]{{"getTextCharacters", "", "4"}, {"getValueAsLong", "", "0"}, {"nextTextValue", "", "1"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=VALUE_N...#364#-849160109", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<d:0.0375>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "1"}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"nextValue", "", "3"}, {"nextTextValue", "", "1"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=0, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=null, getCurrentToken=VALUE_N...#377#-1008755099", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCha...#220#-1787203046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:j1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "httpq://example.c\"m/a?b=c<a?b</a>", "<null>"}}, 1), new String[][]{{"getTextCharacters", "", "1"}, {"nextValue", "", "7"}, {"getTextLength", "", "2"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-9223372036854775808, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurr...#465#1337043379", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(httpq://example.c\"m/a?b=c<a?b</a>), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureM...#248#1835711581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:888>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-Infinity"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "Title", "<null>"}}, 1), new String[][]{{"getTextCharacters", "", "2"}, {"nextValue", "", "7"}, {"getTextLength", "", "4"}, {"getTextCharacters", "", "7"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[-, I, n, f, i, n, i, t, y]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(Title), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCha...#220#2077253673", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:pb>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e3F111.25", "<null>"}}, 2), new String[][]{{"getTextOffset", "", "1"}, {"nextTextValue", "", "4"}, {"getTextLength", "", "7"}, {"close", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#488#-777368813", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e3F111.25), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#923861777", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<d:0.0445>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "\n0xGFF3FFF\016uOT1Ghttp://example.com/a?b=c", "<s:u1oa>"}}, 2), new String[][]{{"overrideCurrentName", "java.lang.String", "5"}, {"nextValue", "", "3"}, {"getTextLength", "", "7"}, {"close", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#528#354093733", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\n0xGFF3FFF\016uOT1Ghttp://example.com/a?b=c), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMas...#246#-213518558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<b:false>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-0.007"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "I\n\n/", "<d:-0.75>"}}, 1), new String[][]{{"overrideCurrentName", "java.lang.String", "6"}, {"close", "", "0"}, {"getTextLength", "", "7"}, {"close", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#82812347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(I\n\n/), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighest...#230#-732953996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"1073741829", "<s:jr9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "\n0xGFF3FFF\016uOT1Ghttp://example.com/a?b=c"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\n0xGFF3FFF\016uOT1Ghttp://example.com/a?b=c), VALUE_NULL, FIELD_NAME(jr9)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeat...#252#797460737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "0x1F", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "9223372036854775812"}}, 2), new String[][]{{"writeBoolean", "boolean", "3"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator", "6"}, {"asParser", "", "5"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#475#-1234122738", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT, VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, ...#240#-342857558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-536870955"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "0x1F", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "9223372036854775812"}}, 2), new String[][]{{"writeBoolean", "boolean", "2"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator", "6"}, {"asParser", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT, VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79,...#241#1498423459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "1", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1), VALUE_TRUE, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#-1806156214", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1), VALUE_TRUE, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#-1806156214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"-0.39"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, START_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, ...#215#-1276409826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<s:key>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-2147483647", "<i:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "a b", "<s:O>"}}, 3), new String[][]{{"nextToken", "", "0"}, {"getValueAsDouble", "", "5"}, {"getValueAsDouble", "double", "6"}, {"nextValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, START_OBJECT, FIELD_NAME(a b), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, get...#237#1563662036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1E-5", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", ".1/(5", "3.0"}}, 3), new String[][]{{"writeNumber", "long", "3"}, {"getOutputContext", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=.1/(5, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1E-5), VALUE_NULL, FIELD_NAME(.1/(5), VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFe...#254#567513558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=...#218#-1007697906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "1", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"17"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "-6"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "15"}}, 3), new String[][]{{"canWriteObjectId", "", "1"}, {"writeEndArray", "", "1"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e300", "<d:35.410000000000004>"}}, 2), new String[][]{{"writeEndArray", "", "6"}, {"writeNumberField", "java.lang.String,int", "5"}, {"writeBoolean", "boolean", "5"}, {"getCodec", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, FIELD_NAME(1.5e300), VALUE_EMBEDDED_OBJECT, END_ARRAY, FIELD_NAME(a), VALUE_NUMBER_INT, VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, ...#280#508893490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "1.52/0http://example.com/a?b=D"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", ", can not serialize"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "TITLEI"}}, 3), new String[][]{{"writeEndObject", "", "2"}, {"writeNumber", "java.lang.String", "4"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator", "4"}, {"canWriteObjectId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.52/0http://example.com/a?b=D), START_OBJECT, FIELD_NAME(, can not serialize), VALUE_NUMBER_FLOAT, END_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively...#310#-1269327063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "S.T1LE[ypeId=41Es,50ht|p:/example,com/a?bcCurrent token ("}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", ", can not!erialiye"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "32767"}}, 2), new String[][]{{"writeNumberField", "java.lang.String,int", "5"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator", "6"}, {"append", "com.fasterxml.jackson.databind.util.TokenBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(, can not!erialiye), START_ARRAY, VALUE_NUMBER_INT, FIELD_NAME(a), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=fal...#285#2049711662", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(, can not!erialiye), START_ARRAY, VALUE_NUMBER_INT, FIELD_NAME(a), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=fal...#285#2049711662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483647", "1073741829"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5e300", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1.5e300), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#-932645325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1.5), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#-1861398047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1.), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#221#-1510742890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1-", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1-), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#221#-836676105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1b", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1b), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#221#2092489954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"--1", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(--1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#1503545000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"-0.0", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(-0.0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#1011925454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"-1.0", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(-1.0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#1773806765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"-1.0", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClo...#210#453876140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"-1.0", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, FIELD_NAME(-1.0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#1364953564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"-1.0", "<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, FIELD_NAME(-1.0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#1364953564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"-1/0", "<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, FIELD_NAME(-1/0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#1943719709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"[objectId=", "<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, FIELD_NAME([objectId=), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#1489822650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"0L", "<null>"}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"/L", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(/L), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighes...#231#1094697031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "--1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(--1)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#1951257195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=f...#205#-1206673739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=f...#205#-1206673739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:3>", "<d:0.375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0...#217#1202546651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<d:0.375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0,...#216#-1536996644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:3>", "<d:0.0375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "10", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_TRUE, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestE...#229#-403341301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<d:-0.0375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "10", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_TRUE, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEs...#228#-341873492", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<d:-0.0375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "10", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<d:-0.0375>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "10", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:5>", "<s:k((>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "", "1E+100"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT, FIELD_NAME(k(()] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCha...#220#-415359894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:4>", "<s:k((>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "", "1E+100"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, i...#214#-2071174645", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:5>", "<s:k((>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(k(()] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:7>", "<s:k((>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:1>", "<s:k((>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:6>", "<s:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=b]VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fals...#202#759012076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:6>", "<s:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "Current token ("}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=b]FIELD_NAME(2020-02-30T25:61:61)[objectId=b], VALUE_STRING[objectId=b], VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWrit...#273#-566999348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:7>", "<s:88>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "Current token ("}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=b]FIELD_NAME(2020-02-30T25:61:61)[objectId=b], VALUE_STRING[objectId=b], VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=t...#264#-2086882651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:7>", "<d:0.0375>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=b]VALUE_NUMBER_FLOAT[objectId=b], VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscap...#225#-23205510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.ObjectCodec", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "15", "-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "Title"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "PT1H", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"/", "<d:14.8>"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(/), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-1465272341", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0", "<d:14.8>"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-2139339126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".", "<d:14.8>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:1>", "<empty>", "15"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-791205556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<d:39.8>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:1>", "<empty>", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<empty>", "-1", "17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#1003970130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"{", "<d:39.8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:1>", "<empty>", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<empty>", "-1", "17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-1154740449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"16"}, false, 14, new String[][]{}, 2), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:0>", "15", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", ".5", "<s:88>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.5), VALUE_EMBEDDED_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#221#-1117992533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", ".5", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.5), VALUE_EMBEDDED_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#220#1362853022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "-1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "21147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21147483648), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#-527248549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "2114748364{"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2114748364{), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#-1020808264", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"-72057594037927965"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "1.5d", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5d), VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#1792079179", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"-72057594037927965"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "16", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(16), VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#1337436594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"268435464"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "/a0b"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(/a0b), START_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#-2020213933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.ObjectCodec", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{" .5e31i"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234567", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a>b</a>", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_INT, FIELD_NAME(<a>b</a>), VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteType...#269#986990135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a>b</a>", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a>), VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#1610516646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a?b</a>", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a?b</a>), VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#-1520869465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a?b</a>", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a?b</a>), VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEsca...#226#341346947", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<d:15.0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "010", "-0.5"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(010), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#-368023391", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"null"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"1.25"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClos...#209#-1626881790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1.5), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#-1861398047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5e300", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1.5e300), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#-932645325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5e3/0", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(1.5e3/0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#-1511411470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"-0.0", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, FIELD_NAME(-0.0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#1011925454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "+1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#-412450360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "+2", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+2), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#-176280537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "+1", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#-412450360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "+1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#-70608468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "+1", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+1), VALUE_EMBEDDED_OBJECT, FIELD_NAME(--1)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscaped...#223#-1893394926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"16"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "--1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "java.io.InputStream,int", "<sample:1>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(--1)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "--1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "java.io.InputStream,int", "<sample:1>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(--1)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedCh...#221#143842887", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "--1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(--1)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#1951257195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=f...#205#-1206673739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<empty>", "2147483647", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isC...#212#953194277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "/a/b", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:7>", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#-1156898374", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fa...#204#-2078263754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:7>", "<i:-22>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:46>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fa...#204#967423318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:7>", "<d:1.5>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<null>", "<d:1.5>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:3>", "<d:15.0>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:4>", "<d:15.0>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:4>", "<d:0.375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, ...#215#-172231294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<d:0.0375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "17", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), START_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighes...#231#1669642027", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:2>", "<d:0.0375>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "10", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_NUMBER_INT, VALUE_TRUE, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMas...#246#1841335249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<null>", "<s:k((>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "", "1E+100"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "-1.(5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "16", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=207, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=207, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<s:ob>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fals...#202#828296806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String,int,int", "1.12345678901234567", "-1", "15"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[TokenBuffer: ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "15", "2147483647"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"<a>b</a>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a>), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fal...#203#-2066256342", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"<a>b</a?", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a?), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fal...#203#405523691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"<a>b</a?", "<d:15.0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a?), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, i...#214#-1226925544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{";a>b</a?", "<d:3.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(;a>b</a?), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, i...#214#858917271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{";a>b</aW?", "<d:35.0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(;a>b</aW?), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, ...#215#1438375246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-0.39"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 14, new String[][]{}), new String[][]{{"getLongValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", ""}}), new String[][]{{"nextTextValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}}), new String[][]{{"getValueAsLong", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "2.5", "-1.7976931348623157E308"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String,int,int", " entries)", "17", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", ""}}), new String[][]{{"peekNextToken", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClo...#210#-777695480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "-57"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-57, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "-60"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-60, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=17, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "[TokenBuffer: ", " "}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=77, getHighestEscapedChar=0, isCl...#211#1471157705", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=77, getHighestEscapedChar=0, isCl...#211#1471157705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "[TokenBuffer: ", " "}}), new String[][]{{"writeNumber", "java.math.BigDecimal", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=77, getHighes...#231#1610746465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=77, getHighes...#231#1610746465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "[TokenBuffer: ", " "}}), new String[][]{{"writeNumber", "java.math.BigDecimal", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=71, getHighes...#231#7959003", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=71, getHighes...#231#7959003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "[TokenBuffer: ", " "}}), new String[][]{{"writeNumber", "java.math.BigDecimal", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighes...#231#713353187", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_STRING, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighes...#231#713353187", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 1, new String[][]{}), new String[][]{{"writeNumber", "java.math.BigDecimal", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=207, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=207, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<sample:2>", "10", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:0>", "15", "-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:0>", "15", "1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:0>", "15", "1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "32767"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"--1", "17", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(-1.5), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.5), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-16385"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "-1.5"}}), new String[][]{{"canOmitFields", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.5), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-8"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "-0.5"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}}), new String[][]{{"canOmitFields", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-0.5), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "\t", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\t), VALUE_STRING, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#221#1495289860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-01-01)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", ".5", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.5), VALUE_EMBEDDED_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#220#1362853022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", ".5", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.5), VALUE_EMBEDDED_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar...#218#80262466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-1", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2147483648), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=...#218#1304540902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "21147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21147483648), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#-527248549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "21147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21147483648), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#-527248549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "21147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21147483648), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0...#217#1325620023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "17", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=17, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "21147483548"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21147483548), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#1744219196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.5), START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isC...#212#485893096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"0xFFFFFFFF", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xFFFFFFFF), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0,...#216#-344335606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"17"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "1.5d", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5d), VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#1792079179", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"-72057594037927965"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "16", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(16), VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#1337436594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"-72057594037927965"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "6", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(6), VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscap...#225#601085417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "null"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1), VALUE_NUMBER_FLOAT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0,...#216#571873042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=77, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=77, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=15, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=15, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=75, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=75, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<empty>", "2147483647", "16"}}), new String[][]{{"writeArrayFieldStart", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false), new String[][]{{"writeArrayFieldStart", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=71, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=71, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "/a/b"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(/a/b), START_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#2031216500", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"-8"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "/a0b"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(/a0b), START_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#-2020213933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#472#1598665032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:4>", "<null>", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 13, new String[][]{}), new String[][]{{"getByteValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"getCurrentToken", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "17"}}), new String[][]{{"getCurrentToken", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "17"}}), new String[][]{{"getCurrentToken", "", "6"}, {"getCurrentTokenId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.4.4-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=4, getPatchLevel=4, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a>b</a>", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a>), VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#1610516646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a>b</a>", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a>), VALUE_EMBEDDED_OBJECT, FIELD_NAME(010), START_ARRAY, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, g...#258#-442132164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a>b</a>", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a>), VALUE_EMBEDDED_OBJECT, FIELD_NAME(1L), START_ARRAY, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ge...#257#910291572", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{" .5e31i"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234567", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "<a>b</a>", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_INT, FIELD_NAME(<a>b</a>), VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteType...#269#986990135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"123456789012345678901234567890", "0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(123456789012345678901234567890), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHigh...#233#311255395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"Current token (", "0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Current token (), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=...#218#-1015719132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"Curr/nt token (", "4.9E-324"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Curr/nt token (), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=...#218#-49356818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"Curr/nt token (", "1.0E-323"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, FIELD_NAME(Curr/nt token (), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestE...#229#1669000719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"Curr/t token (", "1.0E-323"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, FIELD_NAME(Curr/t token (), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#629497193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "123456789012345678901234567890", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(123456789012345678901234567890), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getH...#236#1692100449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-1, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"21147473648"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=77, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<d:15.0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<d:15.0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1", "15", "15"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.4.4-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=4, getPatchLevel=4, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "0"}}), new String[][]{{"isSnapshot", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "0"}}), new String[][]{{"isSnapshot", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"<null>", "-1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "2147483648", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "9223372036854775807"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}), new String[][]{{"isSnapshot", "", "3"}, {"getPatchLevel", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "a"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "9223372036854775808"}}, 2), new String[][]{{"isSnapshot", "", "3"}, {"getPatchLevel", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "a"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "9223372036854775808"}}, 2), new String[][]{{"isSnapshot", "", "3"}, {"getPatchLevel", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "ahttp://example.com/a?b=c"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-9223372036854251520"}}, 2), new String[][]{{"isSnapshot", "", "3"}, {"getPatchLevel", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscape...#224#-566814980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "ahttp://example.com/a?b=c"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-9223372036854251520"}}, 2), new String[][]{{"isSnapshot", "", "3"}, {"getPatchLevel", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedC...#222#1584796440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<sample:2>", "15", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"createChildArrayContext", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"createChildArrayContext", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
