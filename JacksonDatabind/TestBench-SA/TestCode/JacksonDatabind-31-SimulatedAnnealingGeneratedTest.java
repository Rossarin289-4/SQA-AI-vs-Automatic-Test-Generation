package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectRef", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}}), new String[][]{{"getParsingContext", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#94813894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "16", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"/1oCurre9t tk"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "2147483606", "<s:b>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar...#241#-1316905765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=0]VALUE_NULL[objectId=0], VALUE_NULL[objectId=0], END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, ge...#281#314851913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"167772157", "<i:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "9223372036854775808"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "2020-01-01htup:/example.com/a?b=c", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, START_OBJECT, FIELD_NAME(2020-01-01htup:/example.com/a?b=c), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTy...#314#595611429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, g...#236#116914599", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT10e0", "126"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "... (truncated "}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT10e0), VALUE_NUMBER_INT, VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, get...#280#-653343462", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "--1", "10", "2147483647"}}), new String[][]{{"getEmbeddedObject", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.12245674890123456", "2147475455"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.12245674890123456), VALUE_NUMBER_INT, VALUE_NUMBER_INT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureM...#291#2100963537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<null>", "<sample:2>", "2147483606"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"1.1234567", "16"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#-1468708762", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"1", "-2147483648", "126"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "0"}, {"getCodec", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#643128991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "1", "16", "16"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}), new String[][]{{"getTextOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#643128991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "32767"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", ""}}), new String[][]{{"nextFieldName", "", "5"}, {"getTypeId", "", "3"}, {"getTextLength", "", "4"}, {"clearCurrentToken", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#471#1275717674", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=...#240#-121554133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "32767"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}, 2), new String[][]{{"nextLongValue", "long", "5"}, {"getNumberType", "", "3"}, {"getTextLength", "", "1"}, {"clearCurrentToken", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#473#1535949506", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#-766791417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "32759"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "1.5f"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}, 3), new String[][]{{"nextFieldName", "", "5"}, {"getBigIntegerValue", "", "6"}, {"getTextLength", "", "5"}, {"clearCurrentToken", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#471#1275717674", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1.5f), END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getH...#258#-168482814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "16383"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:10>"}}), new String[][]{{"nextFieldName", "", "6"}, {"getBigIntegerValue", "", "2"}, {"getTextLength", "", "0"}, {"close", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=16383, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrentName=null, g...#407#-118742113", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#-766791417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-8191"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>"}}, 3), new String[][]{{"nextFieldName", "", "4"}, {"getBigIntegerValue", "", "2"}, {"getTokenLocation", "", "0"}, {"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N/A", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=...#240#-121554133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "46", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}}), new String[][]{{"getHighestEscapedChar", "", "1"}, {"version", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.4-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=4, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "a(bc", "9.6"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "536870904"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, FIELD_NAME(a(bc), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0...#264#1221054186", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "a(bc", "9.6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(a(bc), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatF...#273#1192832492", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String", "1e10"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:2>", "<sample:0>", "2147483582", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "8abbc", "4.16"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(8abbc), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFe...#272#-231022302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "abc", "95.951"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(abc), VALUE_NUMBER_FLOAT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0,...#263#-268262597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<d:-103.0>"}}), new String[][]{{"append", "com.fasterxml.jackson.databind.util.TokenBuffer", "5"}, {"writeNumber", "float", "1"}, {"writeArrayFieldStart", "java.lang.String", "0"}, {"writeNullField", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: [typeId=-103.0]VALUE_NUMBER_FLOAT[typeId=-103.0], FIELD_NAME()[typeId=-103.0], START_ARRAY[typeId=-103.0], FIELD_NAME(0)[typeId=-103.0], VALUE_NULL] {canOmitFields=true, canWriteBinaryNa...#359#-11970355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=-103.0]VALUE_NUMBER_FLOAT[typeId=-103.0], FIELD_NAME()[typeId=-103.0], START_ARRAY[typeId=-103.0], FIELD_NAME(0)[typeId=-103.0], VALUE_NULL] {canOmitFields=true, canWriteBinaryNa...#359#-11970355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>8>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "17", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<s:>"}}), new String[][]{{"append", "com.fasterxml.jackson.databind.util.TokenBuffer", "2"}, {"writeNumber", "float", "0"}, {"writeArrayFieldStart", "java.lang.String", "3"}, {"writeNullField", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: START_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(sample), START_ARRAY, FIELD_NAME(a), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=fal...#306#1259816661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(sample), START_ARRAY, FIELD_NAME(a), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=fal...#306#1259816661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", ", can not serialjze", "4194243"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "2147483647", "<s:bM>"}}, 3), new String[][]{{"append", "com.fasterxml.jackson.databind.util.TokenBuffer", "4"}, {"writeNumber", "float", "3"}, {"writeArrayFieldStart", "java.lang.String", "3"}, {"writeNullField", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(, can not serialjze), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0,...#263#251453679", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(, can not serialjze), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0,...#263#251453679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false), new String[][]{{"getTextLength", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "<a>b</a>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a>), START_ARRAY, END_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatur...#268#564682631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "<a>b</a>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "536870904"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>b</a>), START_ARRAY, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=536870904, getFormatFeatures=...#265#-1491546306", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<sample:1>", "0", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:0>", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 2), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEsca...#248#-318275729", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEsca...#248#-318275729", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "//o\"Cure9s tk erie)[TokenBuffer: ", "<s:>[>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(//o\"Cure9s tk erie)[TokenBuffer: ), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true,...#303#-675236547", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCh...#243#-884895774", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "Hello, World", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(Hello, World), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#-322276681", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Hello, World), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#-322276681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"12:30:45", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:d9>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "i"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=d9]VALUE_EMBEDDED_OBJECT[objectId=d9], VALUE_NUMBER_FLOAT[objectId=d9], FIELD_NAME(12:30:45)[objectId=d9], VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWrit...#339#-1591638569", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "2020-02-30T25:61:61", "1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "1073741791", "2147483626"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-02-30T25:61:61), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=...#265#2066102858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}, 2), new String[][]{{"nextFieldName", "", "6"}, {"getCurrentName", "", "3"}, {"getCurrentName", "", "3"}, {"close", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#479#58105988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "<a>>b</a>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}}), new String[][]{{"nextFieldName", "", "2"}, {"close", "", "3"}, {"getCurrentName", "", "3"}, {"nextFieldName", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(<a>>b</a>), START_ARRAY, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ge...#260#-735107354", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "-1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "126"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "7Q0d70[F[typeId="}}), new String[][]{{"nextFieldName", "", "7"}, {"close", "", "6"}, {"getValueAsInt", "", "7"}, {"getValueAsDouble", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_NUMBER_INT, FIELD_NAME(7Q0d70[F[typeId=), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureM...#291#970329976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<empty>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "-1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "7Q0d70["}}), new String[][]{{"nextFieldName", "", "7"}, {"close", "", "6"}, {"nextIntValue", "int", "7"}, {"getValueAsDouble", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(7Q0d70[), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=...#287#1963432002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "+///b", "0.0"}}, 2), new String[][]{{"isClosed", "", "7"}, {"hasTextCharacters", "", "6"}, {"getObjectId", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(+///b), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFe...#272#1671899230", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "\037"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "p-1", "<i:0>"}}, 3), new String[][]{{"nextIntValue", "int", "1"}, {"close", "", "7"}, {"getTextCharacters", "", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[G, e, n, e, r, a, t, e, d, T, e, s, t, I, n, p, u, t, P, r, o, x, y]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(p-1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMas...#289#1866567542", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:11>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "/0oCCuzre9t\037tk", "<i:-1>"}}, 1), new String[][]{{"nextIntValue", "int", "2"}, {"close", "", "6"}, {"getTextCharacters", "", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[/, 0, o, C, C, u, z, r, e, 9, t, \037, t, k]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(/0oCCuzre9t\037tk), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, g...#261#1144793883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String,int,int", "/1oCurre9t tk", "1", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", "byte[],int,int", "<null>", "536870904", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(1), VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0...#264#-1210577390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", ".tybeI7=", "<s:\t\t>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}}, 1), new String[][]{{"nextIntValue", "int", "7"}, {"nextFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}, {"getTextCharacters", "", "5"}, {"getValueAsBoolean", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.tybeI7=), VALUE_EMBEDDED_OBJECT, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatur...#268#749921147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<d:1.8>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1899043134", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "17", "17"}}, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "17", "17"}}, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=23, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-1535028666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "-30", "17"}}, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=23, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-711783772", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "-30", "17"}}, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}, {"nextFieldName", "com.fasterxml.jackson.core.SerializableString", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=23, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-711783772", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<null>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "-30", "17"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "-30", "17"}}, 1), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-65549"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",Ltrue"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT, FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getH...#258#420897459", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getH...#258#420897459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"131086"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",Ltrue"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFo...#278#1351071131", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFo...#278#1351071131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345678901234567890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ...#302#496793048", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345678901234567890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ...#302#496793048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345678901234567890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMa...#290#1574411617", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345678901234567890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMa...#290#1574411617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-1150619020", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-1150619020", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-32703"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_TRUE, FIELD_NAME(123456789012345678901234567890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ...#302#-500414063", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_TRUE, FIELD_NAME(123456789012345678901234567890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ...#302#-500414063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"65322"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String", "i"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "12345678901235567890123457890"}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(12345678901235567890123457890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMas...#289#-1724341610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(2020-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#-235223799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"1020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(1020-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#-1707502392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"1020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(1020-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#-1707502392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"1/20-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(1/20-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#1293046057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"1020-01-01"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(1020-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#-149678236", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"202W0-01-01"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(202W0-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0,...#263#-1548779282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "15", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"/0oCuyre9t\037tk"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "2147483606", "<s:bbb>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#1908269132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"/0oCuzre9t\037tk"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "15", "<s:bbb>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"r ,,"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:-2147483631>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(r ,,), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, get...#299#1468030953", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"r ,-"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:-2147483631>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(r ,-), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, get...#299#-707885368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"r ,-"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:-2147483631>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_OBJECT, FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(r ,-), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeI...#311#828755185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"s,-"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:-2147483631>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_OBJECT, FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(s,-), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId...#310#-842221432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"s,-"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:-2147483631>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(GeneratedTestInputProxy), FIELD_NAME(s,-), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getF...#298#-1861621807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{", ", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "17", "46"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(, ), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#2131042017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar...#241#-1316905765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "72057594037929980"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar...#241#-1316905765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#-1503130625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=b]VALUE_NUMBER_INT[objectId=b], END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0,...#263#1471937465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#-1503130625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffere...#221#-1384764006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "8796093022209"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=0]VALUE_NUMBER_INT[objectId=0], END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0,...#263#-2001155243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#1092740690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#1092740690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-1-01"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-1-01), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#-766637762", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-1-0i1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-1-0i1), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1350662141", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-1-7i1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-1-7i1), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1078101238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-1-7ix1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-1-7ix1), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#-695101752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "2147483647"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "16"}}, 1), new String[][]{{"getCodec", "", "7"}, {"overrideStdFeatures", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatur...#268#284255119", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatur...#268#284255119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "16"}}, 1), new String[][]{{"getCodec", "", "7"}, {"overrideStdFeatures", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEs...#250#2001652692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEs...#250#2001652692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}, 1), new String[][]{{"getCodec", "", "7"}, {"overrideStdFeatures", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, is...#213#2072712226", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, is...#213#2072712226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "-24"}}, 1), new String[][]{{"getCodec", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestE...#251#75046103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "-268435480"}}, 1), new String[][]{{"getCodec", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#536304379", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteTypeId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234567", "268435480"}}, 1), new String[][]{{"getCodec", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestE...#251#2094472778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234r67", "-268435352"}}, 2), new String[][]{{"getCodec", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234r67), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestE...#251#-536209427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#130262905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "-29"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=...#240#-196598243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "9223372036854775808"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "-0.09063"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "123456789012345578901234567890", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345578901234567890), VALUE_STRING, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWr...#318#16350381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"16", "<i:-1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0x123456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x123456789), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#1735819049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"16", "<i:-1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0xi123456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xi123456789), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#-7174438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"16", "<i:-26>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0xi123456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, FIELD_NAME(0xi123456789), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0...#264#-1911977942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"16", "<i:-26>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-555", "<i:-52>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "2147483606", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0xi123456789"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xi123456789), START_OBJECT, FIELD_NAME(-52)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeature...#267#-73840549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"7779", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-684986717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"7779", "<i:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#-1059625345", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"7779", "<s:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, START_ARRAY, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#628627443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"7746", "<s:>8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, END_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#648307571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"7746", "<s:>8/>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, END_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#335931215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-1", "<s:>8d/_>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String", "a b"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#1960799229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1268912675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1268912675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=1]FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHi...#257#-526123160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=a]FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHi...#257#-1539554408", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<empty>", "2147483647", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=a]FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHi...#257#-1539554408", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"2020-02-30T25:61:61", "-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-02-30T25:61:61), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=...#265#2066102858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectRef", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}}), new String[][]{{"nextFieldName", "com.fasterxml.jackson.core.SerializableString", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectRef", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#459#-279921110", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-491606870", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#508168395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:_b>"}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<empty>", "10", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#786434954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<sample:2>", "46", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5d), VALUE_NULL, FIELD_NAME(0), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, get...#280#-1508117556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<sample:2>", "46", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5d), VALUE_NULL, FIELD_NAME(1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, get...#280#307369933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<sample:2>", "46", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#-1693044853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<sample:2>", "46", "1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "1.5e"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e), VALUE_NULL, FIELD_NAME(1), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, get...#280#171342636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "1.5e"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e), VALUE_NULL, FIELD_NAME(), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getF...#279#1486234369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", "int,int", "10", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=30, getFormatFeatures=0, getHighestEsc...#249#1227727907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"(", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "5."}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", "int,int", "10", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING, FIELD_NAME((), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=30, getFormatFeatures=0...#264#999865814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"i", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=...#240#389546930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"i", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(i), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#-2075849367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0,...#238#899981258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#-1848984207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHi...#257#1970908310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"58", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(58), VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, get...#259#-839836487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"58", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(58), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getH...#258#655439746", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=159, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, ...#215#1212572350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"15"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "17", "17"}}), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}, {"getDoubleValue", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "17", "17"}}), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"overrideFormatFeatures", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<null>", "17", "17"}}), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"asParser", "com.fasterxml.jackson.core.JsonParser", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=23, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-1535028666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"16"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#-222423025", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#-222423025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"16"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",L"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(,L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#2037157642", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(,L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#2037157642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"15"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",L"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT, FIELD_NAME(,L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighe...#254#1384567169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(,L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighe...#254#1384567169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"15"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",L"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_ARRAY, FIELD_NAME(,L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#172526123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, FIELD_NAME(,L), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#172526123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"15"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",Ltrue"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT, FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getH...#258#420897459", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getH...#258#420897459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"15"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-65549"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ",Ltrue"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-1268763716", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(,Ltrue), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-1268763716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"65322"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "12345678901235567890123457890"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_TRUE, FIELD_NAME(12345678901235567890123457890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, g...#301#-1098534810", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_TRUE, FIELD_NAME(12345678901235567890123457890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, g...#301#-1098534810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"65322"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String", "i"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "12345678901235567890123457890"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(12345678901235567890123457890), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMas...#289#-1724341610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#-501975086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"3020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(3020-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#970303507", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(2020-01-01), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#-235223799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "1.5e300", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT, START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=...#265#1289514663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"/oCuzre9u\037t"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "15", "<s:bbb>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutput...#228#546741556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "15", "<s:bbb>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"[1 ,"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "15", "<s:bbb>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar...#241#-1316905765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#-1503130625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "12:30:45", "15"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=29, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-1773704893", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=29, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-1773704893", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighe...#254#1211363770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "Hello, World", "1.12345678"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Hello, World), VALUE_STRING, VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, ge...#281#-47059793", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#-1503130625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#-1503130625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar...#241#-1316905765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"16"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<i:39>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"2147483606"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<sample:2>", "2147483647", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "1.0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483606, getFormatFeatures=0, getHighestEscapedChar=...#240#-430116724", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483606, getFormatFeatures=0, getHighestEscapedChar=...#240#-430116724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "72057594037929980"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=b]VALUE_NUMBER_INT[objectId=b], END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0,...#263#1471937465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String", "010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "1", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#134227666", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#134227666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "17", "17"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "[TokenBuffer: ", "1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"[objectId="}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(--1), VALUE_NULL, FIELD_NAME([objectId=), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFea...#296#-1160738154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"[objectId= entries)"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(--1), VALUE_NULL, FIELD_NAME([objectId= entries)), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=fals...#305#1661934187", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"[objectId= entries)"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, VALUE_NUMBER_INT, FIELD_NAME(--1), VALUE_NULL, FIELD_NAME([objectId= entries)), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWrit...#317#1322820667", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, VALUE_NUMBER_INT, FIELD_NAME(--1), VALUE_NULL, FIELD_NAME( ), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, get...#299#-935648598", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "17"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE, VALUE_NUMBER_INT, FIELD_NAME(--1), VALUE_NULL, FIELD_NAME(), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getF...#298#-1151483778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<null>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#399719329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "16"}}), new String[][]{{"getCodec", "", "7"}, {"overrideStdFeatures", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=27, getFormatFeatures=0, getHighestE...#251#934910800", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=27, getFormatFeatures=0, getHighestE...#251#934910800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "16"}}), new String[][]{{"getCodec", "", "7"}, {"overrideStdFeatures", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEs...#250#2001652692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEs...#250#2001652692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "15", "2147483606"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String,int,int", "2020-01-01", "0", "2147483606"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "2147483606"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "16"}}), new String[][]{{"getCodec", "", "7"}, {"overrideStdFeatures", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatur...#268#284255119", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatur...#268#284255119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "2147483647"}}), new String[][]{{"getCodec", "", "7"}, {"overrideStdFeatures", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#229#-1969762117", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#229#-1969762117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.5e300", "-268435480"}}), new String[][]{{"getCodec", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e300), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#536304379", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234567", "-268435480"}}), new String[][]{{"getCodec", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestE...#251#2094472778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1.1234r67", "-268435352"}}), new String[][]{{"getCodec", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234r67), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestE...#251#-536209427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-258246973", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-258246973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "17"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "a b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "-69"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#130262905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "0.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "aaaaaaaaaaaaaaaabaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-1698230682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "0.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "123456789012345678901234567890", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "aaaaaaaaaaaaaaaabaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345678901234567890), VALUE_STRING, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ...#302#-2027087891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "0.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "123456789012345678901234567890", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "aaaaaaaaaaaaaaaabaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345678901234567890), VALUE_STRING, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, ge...#300#-1266998383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "15", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "-0.063"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "123456789012345578901234567890", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, FIELD_NAME(123456789012345578901234567890), VALUE_STRING, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ...#302#2017778126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteTypeId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[TokenBuffer: ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"16", "<i:-1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0x123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x123456789), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#1735819049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:0>", "<sample:1>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<empty>", "1", "2147483606"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"15"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"short"}, new String[]{"-32768"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-314", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0xi123456779"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xi123456779), START_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=30...#285#251607413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-357", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "0xi123456779"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xi123456779), START_OBJECT, VALUE_FALSE, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=30, ...#283#1884815779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-357", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=30, getFormatFeatures=0, getHighestEscapedCh...#243#-1672235837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-357", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCh...#243#-504039582", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#1960799229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCh...#243#-435143813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<s:>8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"char"}, new String[]{"\000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"46", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#213#86924352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"15", "7746"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#1699682292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#-219282082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#-219282082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "PT1H", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "PT1H", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "PT1H", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "10", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "/0oCuzre9t\037tk", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "PT1H", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1H), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#-1415035397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "2147483647", "46"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1H), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#-1415035397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1H), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#846945966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1H), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#1417553554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "T1H", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(T1H), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, get...#259#-1553617687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#208581228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1H), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ge...#260#1417553554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9PT1H"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#208581228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1H), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-1503232737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1H", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\u00e9PT1H"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1H), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#846945966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483633"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, get...#259#973476518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscaped...#245#-839099341", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "-/.01"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=23, getFormatFeatures=0, get...#259#1455523491", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=23, getFormatFeatures=0, getHighestEscaped...#245#-357052368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\t-/.01"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<empty>", "46", "7746"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\t-/.01"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=23, getFormatFeatures=0, g...#261#-227276353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\t-/.01"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "\t-/.01"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, get...#259#973476518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"i"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "short", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(i), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHi...#257#1621453703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<sample:1>", "2147483647", "15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT1", "-2147483648"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "char[],int,int", "<sample:0>", "-40", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT1), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscaped...#245#-839099341", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<sample:0>", "0", "10"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.4-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=4, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(abc)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#229#924252768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"double"}, new String[]{"-1.0"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "1", "<empty>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatur...#293#-643904615", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<empty>", "15", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[TokenBuffer: ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, is...#213#904515971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT10e0", "92"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "X b"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "QT10e0", "-92"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "X b"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(QT10e0), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ...#262#-79564705", SearchInputFactory_scaffolding.receiverState());
 }
}
