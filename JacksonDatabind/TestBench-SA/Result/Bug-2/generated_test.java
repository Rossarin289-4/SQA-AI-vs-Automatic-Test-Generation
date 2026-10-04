package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "."}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "0", "<s:b>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<<c>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[TokenBuffer: "}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=<<c]FIELD_NAME(a b[TokenBuffer: )[objectId=<<c], START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, ...#240#-1991838811", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, END_ARRAY, VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-1993535412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:6>", "<s:key>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "1l5", "-281474976710657"}}), new String[][]{{"clearCurrentToken", "", "1"}, {"getTokenLocation", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(1l5), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsc...#227#-640601661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "0.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "17", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}}, 2), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator", "4"}, {"asParser", "", "1"}, {"hasTextCharacters", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-1.568"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "4611686018427387859"}}, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator", "0"}, {"writeEndObject", "", "0"}, {"writeNumber", "short", "7"}, {"copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<empty>", "0", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}}), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(12:30:45), START_ARRAY, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, ...#215#1460781894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"010[TokenBuffer "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "\t", "-0.03"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\t), VALUE_NUMBER_FLOAT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=...#218#-1481268704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<sample:2>", "2147483647", "0"}}), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: START_OBJECT, FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCha...#220#715769703", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCha...#220#715769703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{"int"}, new String[]{"-2147483648"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "1.5d", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5d), VALUE_EMBEDDED_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#1241936720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-24"}}), new String[][]{{"getCodec", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}}, 2), new String[][]{{"asParser", "com.fasterxml.jackson.core.JsonParser", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=15, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "a,b,c"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:1>"}}), new String[][]{{"overrideCurrentName", "java.lang.String", "1"}, {"getParsingContext", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=a, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "[objectId=", "-1.5"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-2147479552"}}, 2), new String[][]{{"overrideCurrentName", "java.lang.String", "5"}, {"getObjectId", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([objectId=), VALUE_NUMBER_FLOAT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#-101400548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", "byte[],int,int", "<sample:1>", "2147483647", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:4>"}}, 3), new String[][]{{"getTextLength", "", "7"}, {"getCurrentName", "", "5"}, {"isClosed", "", "2"}, {"overrideCurrentName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#1985303658", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fa...#204#1220401462", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 1), new String[][]{{"getTextLength", "", "7"}, {"getCurrentName", "", "4"}, {"nextLongValue", "long", "0"}, {"overrideCurrentName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#489#1209634937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "10.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "C6", "<i:0>"}}, 2), new String[][]{{"getTextLength", "", "4"}, {"getTypeId", "", "7"}, {"nextLongValue", "long", "4"}, {"overrideCurrentName", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=10, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=10, getCurrentName=, getCurrentToken=VALUE_NUMBE...#369#-1044119166", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(C6), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEsca...#226#1666053667", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "187.86"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}, 1), new String[][]{{"getTextLength", "", "3"}, {"close", "", "1"}, {"nextTextValue", "", "5"}, {"overrideCurrentName", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#474#-1478739899", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "1.7014116E38"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}}), new String[][]{{"getValueAsInt", "", "7"}, {"getTextCharacters", "", "7"}, {"getEmbeddedObject", "", "2"}, {"overrideCurrentName", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#468#1632682927", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "-3.4028232E37"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:4>"}}), new String[][]{{"nextFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}, {"getTextCharacters", "", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[-, 3, ., 4, 0, 2, 8, 2, 3, 2, E, 3, 7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-1073741824", "2147483519"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "a,b,c", "16"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", ","}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:b>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=b]VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=77, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"-1342177320"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}}, 1), new String[][]{{"writeNumber", "short", "5"}, {"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-1342177320, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "\u00eafntrids)1.5"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "\u00e9", "12:30:45"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(\u00e9), VALUE_STRING, VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEs...#228#1029415484", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "(1._23466789012{3567", "0122"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME((1._23466789012{3567), VALUE_STRING, VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMa...#247#-1843932457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-2147483647", "2147483647"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-120"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "-67"}}), new String[][]{{"firstToken", "", "6"}, {"getCodec", "", "3"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "5"}, {"getTextOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_FALSE, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, is...#213#-128502197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "0x", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "536870904", "<s:>"}}, 1), new String[][]{{"firstToken", "", "6"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-34", "<s:n\"T>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "010"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:D>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<d:-1.5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "+1", "<s:)<9>"}}), new String[][]{{"asParser", "com.fasterxml.jackson.core.JsonParser", "5"}, {"getCurrentName", "", "3"}, {"nextIntValue", "int", "3"}, {"getText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#-70608468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "\t", "<d:1.5>"}}), new String[][]{{"asParser", "com.fasterxml.jackson.core.JsonParser", "5"}, {"getCurrentName", "", "3"}, {"nextIntValue", "int", "7"}, {"getText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GeneratedTestInputProxy", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, FIELD_NAME(\t), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCh...#221#289408318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "\n", "<d:1.5>"}}, 3), new String[][]{{"asParser", "com.fasterxml.jackson.core.JsonParser", "5"}, {"getCurrentName", "", "3"}, {"nextIntValue", "int", "2"}, {"getText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_STRING, FIELD_NAME(\n), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHig...#234#939294133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "-118"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", ",can not seializd", "<null>"}}), new String[][]{{"asParser", "com.fasterxml.jackson.core.JsonParser", "0"}, {"getValueAsInt", "int", "5"}, {"nextIntValue", "int", "7"}, {"getTextLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(,can not seializd), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighest...#230#-1119943810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"0", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa), VALUE_NUMBER_FLOAT, FIELD_NAME(0), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false...#261#-1631513714", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "-12"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}, 3), new String[][]{{"asParser", "com.fasterxml.jackson.core.JsonParser", "4"}, {"isExpectedStartArrayToken", "", "4"}, {"nextIntValue", "int", "6"}, {"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=-12, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=-12, getCurrentName=null, getCurrentToken=VALUE...#378#-1326579251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",\037can sot serialize"}}, 1), new String[][]{{"disable", "com.fasterxml.jackson.core.JsonParser$Feature", "3"}, {"peekNextToken", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, FIELD_NAME(,\037can sot serialize), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEs...#228#2008337440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "2047(8365-"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}}, 3), new String[][]{{"disable", "com.fasterxml.jackson.core.JsonParser$Feature", "7"}, {"peekNextToken", "", "2"}, {"close", "", "1"}, {"peekNextToken", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:A@<9Hjt>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<b:false>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=f...#205#1086279886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "."}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "0", "<s:b>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(a b), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, i...#213#-1940026035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(a b), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, ...#214#1423857632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b[TokenBuffer: ", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(a b[TokenBuffer: ), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestE...#228#-1652343228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"2020-02-3"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "0x1F", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_TRUE, VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getH...#236#-628841902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"2021-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "0x1F", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, FIELD_NAME(0x1F), VALUE_TRUE, VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeature...#249#-763441798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"202+1-1"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "0x1F", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, FIELD_NAME(0x1F), VALUE_TRUE, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#1531800844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"202+1-1"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#1849017058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"202+1-1"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=...#218#-1199778895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"202+1-1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:-4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"XX"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"Yl("}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"Yl("}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "37"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=37, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"Yl("}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "20"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=20, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"Yl("}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "54"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=54, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-4", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, START_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#1719924666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-4", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, START_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#442391326", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-63", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, START_OBJECT, START_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#2146613710", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-64", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-32768"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-32768"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"1.1234567", "-1.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isC...#212#-509127583", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}, 2), new String[][]{{"canWriteTypeId", "", "5"}, {"writeNullField", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#-1313881317", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#-1313881317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "1L"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}}, 2), new String[][]{{"canWriteTypeId", "", "5"}, {"writeNullField", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1L), FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0...#217#-1045418511", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1L), FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0...#217#-1045418511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "1L"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}}, 2), new String[][]{{"canWriteTypeId", "", "5"}, {"writeNullField", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1L), VALUE_NUMBER_INT, FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHi...#235#-420829354", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1L), VALUE_NUMBER_INT, FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHi...#235#-420829354", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "/L"}}, 2), new String[][]{{"canWriteTypeId", "", "5"}, {"writeNullField", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(/L), FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0...#217#-1532492237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(/L), FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0...#217#-1532492237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"{\"a#:1}"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({\"a#:1}), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fals...#202#940208294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"{\"a#:1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({\"a#:1), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#-1773940719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"{\"a#41"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({\"a#41), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#-1963526185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"{\"a#41"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<empty>", "17", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({\"a#41), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"{\"a#41"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<empty>", "17", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xFFFFFFFF), VALUE_NULL, FIELD_NAME({\"a#41), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHi...#235#628471373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"123456789012345678901234567890", "<i:-4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, FIELD_NAME(123456789012345678901234567890), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureM...#248#1838337930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"123456789013345678901234567890", "<i:-4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, FIELD_NAME(123456789013345678901234567890), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureM...#248#-202337175", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"123456789013345678901234567890", "<i:-4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(123456789013345678901234567890), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getH...#236#-348574656", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFFFFFF", "<s:<)c>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xFFFFFFFF), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0,...#216#-344335606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFFFFF", "<s:<))c>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xFFFFFFF), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, ...#215#-399419204", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1", "1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "0x1F", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:ej>"}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "1e10", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"2.516[oajectId=112345678"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "110a b", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"2.5076[oajctIdI010"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.5", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.5", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "1l5", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "1l5", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"true", "1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(true), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=f...#205#-758477139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World", "1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Hello, World), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, is...#213#-39564629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\u00e9", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, FIELD_NAME(\u00e9), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCha...#220#701422409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\u00e9", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<null>", "-1", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(\u00e9), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighest...#230#1448947295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\u00e9", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(\u00e9), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatur...#250#-1490027529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\u00e9", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, START_ARRAY, VALUE_NUMBER_FLOAT, FIELD_NAME(\u00e9), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=fal...#263#377966259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\u00e9", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, START_ARRAY, FIELD_NAME(\u00e9), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7...#243#-1892403429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.503301", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:0>", "17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(1.503301), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, get...#237#1922975595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", ","}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-18.36"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.ObjectCodec", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "-281474976710593"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-746458340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-36.72"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.ObjectCodec", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "-281474976710593"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-746458340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.ObjectCodec", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "-281474976710593"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.ObjectCodec", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"Title", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Title), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#1599336499", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:<c>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<c>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<c>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b"}}, 1), new String[][]{{"inArray", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<ec>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[TokeBuffr: "}}, 1), new String[][]{{"createChildArrayContext", "", "6"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=<ec]FIELD_NAME(a b[TokeBuffr: )[objectId=<ec], START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, ge...#238#299062934", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<ec>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[TokeBuffr: "}}, 1), new String[][]{{"createChildArrayContext", "", "6"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b[TokeBuffr: ), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isC...#212#-55352934", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<ec>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "[TokenBuffer: ", "-9223372036854775808"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[TokeBuffr: "}}, 1), new String[][]{{"createChildArrayContext", "", "6"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_NUMBER_INT, FIELD_NAME(a b[TokeBuffr: ), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, g...#258#-1019492042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<ec>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "[TokenBuffer: ", "-9223372036854775808"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[Toke"}}, 1), new String[][]{{"createChildArrayContext", "", "6"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([TokenBuffer: ), VALUE_NUMBER_INT, FIELD_NAME(a b[Toke), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatu...#251#765305947", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:VVec>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:3>", "<null>", "11", "-4"}}, 1), new String[][]{{"createChildArrayContext", "", "6"}, {"inObject", "", "0"}, {"createChildObjectContext", "", "3"}, {"getTypeDesc", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"Currdnt token (", "8"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Currdnt token (), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0,...#216#-1688851984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"Currdnt token (1.5f", "8"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Currdnt token (1.5f), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedCha...#220#1841923358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "0", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "."}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "0", "<s:<c>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}), new String[][]{{"writeNumber", "java.math.BigInteger", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "."}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}), new String[][]{{"writeNumber", "java.math.BigInteger", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", ","}}), new String[][]{{"writeNumber", "java.math.BigInteger", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", ","}}), new String[][]{{"writeNumber", "java.math.BigInteger", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_ARRAY, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", ","}}), new String[][]{{"writeNumber", "java.math.BigInteger", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_ARRAY, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", ","}}), new String[][]{{"writeNumber", "java.math.BigInteger", "7"}, {"close", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_ARRAY, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(a b), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0,...#216#2138960320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{" entries)", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME( entries)), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedC...#222#1943900758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", " ", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME( ), VALUE_EMBEDDED_OBJECT, FIELD_NAME(a b), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFe...#254#1846838501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", " ", "<s:a>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME( ), VALUE_EMBEDDED_OBJECT, FIELD_NAME(a b), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeat...#252#662169409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", " ", "<s:a>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME( ), VALUE_EMBEDDED_OBJECT, FIELD_NAME(a b), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFea...#253#209537764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("79", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", " ", "<s:a>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME( ), VALUE_EMBEDDED_OBJECT, FIELD_NAME(), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeature...#249#-1094151290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"a c", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", " ", "<s:a>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME( ), VALUE_EMBEDDED_OBJECT, FIELD_NAME(a c), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFea...#253#-542011389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}}), new String[][]{{"getValueAsString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "0x1F", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_TRUE, VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getH...#236#-628841902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"//2a=b"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"XX"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "10"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "16", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-4", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-4", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, START_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#442391326", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-4", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, START_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#1719924666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "Hello, World", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Hello, World), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, is...#213#-39564629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<sample:1>", "-1", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "-4"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-4, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<sample:1>", "-1", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "4"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "-1", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "32767"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-4", "17"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#474#1075917232", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}), new String[][]{{"getDecimalValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}), new String[][]{{"getDoubleValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}), new String[][]{{"canWriteTypeId", "", "7"}, {"writeNullField", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#-1313881317", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#-1313881317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:5>"}}), new String[][]{{"canWriteTypeId", "", "5"}, {"writeNullField", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(12:30:45), VALUE_NULL, FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHi...#235#-1634980398", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(12:30:45), VALUE_NULL, FIELD_NAME(sample), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHi...#235#-1634980398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:5>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "1.5f", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5f), VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsc...#227#-668002216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"1.7014117E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "Current token (", "1.7976931348623155E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Current token (), VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, ge...#238#-818550468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"-1.7014117E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "Current tojen (", "1.7976931348623155E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Current tojen (), VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, ge...#238#1966395003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"-1.7014117E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "Current tojen (", "8.988465674311578E307"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Current tojen (), VALUE_NUMBER_FLOAT, VALUE_TRUE, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatur...#250#1472240203", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"-1.7014117E37"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "Current tojen\037(", "8.988465674311578E307"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Current tojen\037(), VALUE_NUMBER_FLOAT, VALUE_TRUE, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatur...#250#1606822892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"-3.4028232E37"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#1310893231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2147483648), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=f...#205#129106910", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"21474836481.12345678901234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21474836481.12345678901234567), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscape...#224#-1274943432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"21474836481.2345678901234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21474836481.2345678901234567), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#574474371", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"21874836481.2345678901234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21874836481.2345678901234567), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#878836223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({\"a\":1}), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fals...#202#1355535111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483648", "16"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "\uffff"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\u00e9), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "\uffff"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#1261892455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "\uffff"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(I), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "\uffff"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1", "1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "0x1F", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "//2a=b", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"i", "15"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fals...#202#-1221544416", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"i", "15"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(--1), FIELD_NAME(i), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar...#219#-149128868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"17"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "202+1-1", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(202+1-1), VALUE_NUMBER_INT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighes...#231#-473930505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:-36>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, ...#215#203965023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "15"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "2147483647", "17"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:13>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"2020-02-30T25:61:61", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-02-30T25:61:61), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscap...#225#595856282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"{\"a\":1}", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({\"a\":1}), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, is...#213#-611521924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", " entries)", "16"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME( entries)), VALUE_NUMBER_FLOAT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEsca...#226#-145964080", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", "java.lang.String,boolean", "1e10", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<empty>", "-4", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<empty>", "-4", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "+1", "17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+1), VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, i...#214#1502234808", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "5.", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", " entries)", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#-964817385", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "1.5", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"a", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "[TokenBuffer: "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-808873223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<null>", "<sample:0>", "0", "-4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.JsonParser", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "[objectId=", "-1.0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=[objectId=, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([objectId=), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, is...#213#-311031334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}), new String[][]{{"getParent", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}), new String[][]{{"getCurrentIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}), new String[][]{{"getCurrentIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"1.5d", "9223372036854775807"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "0", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"bEd12:30:4", "17996806323437632"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "1073741824", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"Hello, World", "15"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Hello, World), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, is...#213#-39564629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"Hello, Wprld", "-4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Hello, Wprld), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, is...#213#196605194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"Hello, Wprl", "-4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Hello, Wprl), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isC...#212#1466293328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#-1659731215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-18446744073708634060"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<sample:2>", "10", "-4"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=111, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854317030"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<sample:2>", "10", "-4"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "1.5", "0.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5), VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=111, getHighestEscap...#225#-1767578126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"1.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-746458340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"32.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "-281474976710657"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#-746458340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"1.503301"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String", "2.516[oajectId=112345678"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteTypeId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:5>", "<sample:2>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<sample:1>", "1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-3.840"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "9223372036854775749"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "1.25", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1.25), VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask...#245#1825130735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-0.9040"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:4>", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "9223372036854775781"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=...#218#519139227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-0.04030"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:4>", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:4>", "<s:>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"short"}, new String[]{"15"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"short"}, new String[]{"15"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"short"}, new String[]{"32767"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(GeneratedTestInputProxy), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getH...#236#-27076301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "true", "59", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "true", "59", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\n", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\n), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed...#207#2000362224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:<c>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{?} {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<<c>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[TokenBuffer: "}}), new String[][]{{"inObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b[TokenBuffer: ), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, i...#214#-1696098423", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<ec>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[TokenBuffer: "}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}}), new String[][]{{"createChildArrayContext", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b[TokenBuffer: ), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, i...#214#-1696098423", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:<ec>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "a b[TokeBuffr: "}}), new String[][]{{"createChildArrayContext", "", "6"}, {"inObject", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=<ec]FIELD_NAME(a b[TokeBuffr: )[objectId=<ec], START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, ge...#238#299062934", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1L), START_OBJECT, VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isC...#212#-1311216968", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "1", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1), VALUE_NULL, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#1411844721", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1), VALUE_NULL, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClose...#208#1411844721", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "1.25", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1.25), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClo...#210#1391932210", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.25), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClo...#210#1391932210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"0xFFFFyFFF", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xFFFFyFFF), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=...#206#-116009810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"-1", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"c02+1-1", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(c02+1-1), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fal...#203#796981340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"c", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(c), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "-1.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.5), START_OBJECT, FIELD_NAME(0x1), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighest...#230#-1949146859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"ox1", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "-1.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.5), START_OBJECT, FIELD_NAME(ox1), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighest...#230#1778863828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"ox1", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "-0.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-0.5), START_OBJECT, FIELD_NAME(ox1), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighest...#230#-2082139787", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"o1", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "-0.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-0.5), START_OBJECT, FIELD_NAME(o1), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestE...#229#-1684829983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "-1.0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.4.0-rc4 {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=4, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "-1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.4.0-rc4 {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=4, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false...#201#1575188103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "-1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.4.0-rc4 {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=4, getPatchLevel=0, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"16", "0"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(16), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscaped...#223#-389198116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"123456789012345678901234567890", "16"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(123456789012345678901234567890), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHigh...#233#311255395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "-0.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"\n", "16"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\n), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fals...#202#128286657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"1l5"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "202+1-1", "10", "10"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClos...#209#-552188081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "202+1-1", "10", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"aa\naaaaaaaaIaaaaaaaaaabaaaaaaaa"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "202+1-1", "-5", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "[objectId="}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=fal...#203#933759716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"aa\naaaaaaaaIaaaaaaaaaabaaaaaaaxa"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "202+1-1", "-5", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "[objectId="}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, START_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0...#217#-124816172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=79, getHighestEscapedChar=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "0x1F", "-1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getHighestEscapedChar=0, ...#215#415725081", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getHighestEscapedChar=0, ...#215#415725081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "0x1F", "-1.0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getHighestEscapedChar=0, ...#215#415725081", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getHighestEscapedChar=0, ...#215#415725081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"-23"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "0x1F", "-1.0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-23, getHighestEscapedChar=0, isClose...#208#-141497337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-23, getHighestEscapedChar=0, isClose...#208#-141497337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"23"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "0x1F", "-1.0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=23, getHighestEscapedChar=0, isClosed...#207#1486833646", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x1F), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=23, getHighestEscapedChar=0, isClosed...#207#1486833646", SearchInputFactory_scaffolding.receiverState());
 }
}
